const signUpButton = document.getElementById('signUp');
const signInButton = document.getElementById('signIn');
const container = document.getElementById('container');

signUpButton.addEventListener('click', () => {
	container.classList.add("right-panel-active");
});

signInButton.addEventListener('click', () => {
	container.classList.remove("right-panel-active");
});

function login(event) {
	event.preventDefault();

	const email = document.getElementById("login_email").value;
	const password = document.getElementById("login_password").value;

	console.log(email, password);

	if(email == "" || password == ""){
		console.log('Something is missing');
		swal("OOPS!!!!!!", "Fill Up all the Columns", "warning");
		return;
	}

	fetch("http://localhost:8081/login", {
		method: "POST",
		headers: {
			"Content-Type": "application/json"
		},
		body: JSON.stringify({
			email: email, 
			password: password, 
			username: ""})
	}).then(data => data).then(res => {
		console.log(res);
		if (res.status == 200) {
			swal("Good job!", "LoggedIn Successfully", "success");
		} else {
			swal("OOPS!!!!!!", "Failed to Login", "error");
		}

	})
	.catch(err => {
		swal("OOPS!!!!!!", "Please specify correct email", "error");
	})
}

function signup(event){
	event.preventDefault();

	const username = document.getElementById("name").value;
	const user_email = document.getElementById("email").value;
	const user_password = document.getElementById("password").value;
	const confirm_password = document.getElementById("confirm-password").value;
	
	if(username == "" || user_email == "" || user_password=="" || confirm_password== ""){
		console.log('Something is missing');
		swal("OOPS!!!!!!", "Fill Up all the Columns", "warning");
		return;
	}

	console.log(username, user_email, user_password);
	if(user_password != confirm_password){
		swal("OOPS!!!!!!", "Passsword Mis-match", "error");
	}else{
		fetch("http://localhost:8081/signup" , {
			method: "POST",
			headers: {
				"Content-Type": "application/json"
			},
			body: JSON.stringify({
				username: username,
				email: user_email,
				password: user_password
			})
		}).then(data => data).then(res => {
			console.log(res);
			if (res.status == 200) {
				swal("Good job!", "Signed Up Successfully", "success");
			} else {
				swal("OOPS!!!!!!", "Faild", "error")
			}
	
		})
		.catch(err => {
			swal("OOPS!!!!!!", "Account Exists", "warning")
		})
	}

}
 
function OTP(event){
	event.preventDefault();

	const otp_mail = document.getElementById("email").value;
	console.log(otp_mail);

	fetch("https://localhost:8081/sendotp" , {
		method: "POST",
		headers: {
			"Conten-type": "application/json"
		},
		body: JSON.stringify({
			email: otp_mail
		})
	})
}