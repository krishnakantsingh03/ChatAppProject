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

	document.querySelector("#loading").style.visibility = "visible";
	document.querySelector("#loading").style.display = "block";

	fetch("http://localhost:8082/login", {
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