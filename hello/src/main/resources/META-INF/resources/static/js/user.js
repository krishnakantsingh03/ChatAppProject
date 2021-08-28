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

	const email = document.getElementById("email").value;
	const password = document.getElementById("password").value;


	console.log(email, password)
	console.log('I am here');

	document.querySelector("#loading").style.visibility = "visible";
	document.querySelector("#loading").style.display = "block";

	fetch("http://localhost:8085/login", {
		method: "POST",
		headers: {
			"Content-Type": "application/json"
		},
		body: JSON.stringify({email, password})
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
	}



}