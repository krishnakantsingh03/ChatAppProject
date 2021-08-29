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

	document.querySelector("#loading").style.visibility = "visible";
	document.querySelector("#loading").style.display = "block";

	fetch("http://localhost:8081/login", {
		method: "POST",
		headers: {
			"Content-Type": "application/json"
		},
		body: JSON.stringify({email, password, username: ""})
	}).then(data => data).then(res => {
		console.log("Response:: ", res);
		document.querySelector("#loading").style.visibility = "hidden";
		document.querySelector("#loading").style.display = "none";

	})
	.catch(err => {

		document.querySelector("#loading").style.visibility = "hidden";
		document.querySelector("#loading").style.display = "none";
	
	})
}

function signup(event){
	event.preventDefault();

	const username = document.getElementById("name").value;
	const user_email = document.getElementById("email").value;
	const user_password = document.getElementById("password").value;
	const confirm_password = document.getElementById("confirm-password").value;


	console.log(username, user_email, user_password);
	if(user_password != confirm_password){
		alert('Password Mis-match');
	}else{
		alert('Successfully Signed Up')
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
		})
	}

}
 