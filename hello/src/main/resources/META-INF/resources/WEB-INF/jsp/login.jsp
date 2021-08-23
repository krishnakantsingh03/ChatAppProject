<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!Doctype html>
<html>

<head>
    <meta charset="UTF-8" />
    <title> Welcome to Chat App </title>
    <link href="../../static/css/signup.css" type="text/css" rel="stylesheet" />
	<script src='https://kit.fontawesome.com/a076d05399.js' crossorigin='anonymous'></script>

</head>

<body>
   <div class="container" id="container">
   	<div class="form-container sign-up-container">
   		<form action="#">
   			<h1>Create Account</h1>
   			<div class="social-container">
   				<a href="https://facebook.com" class="social" target="_blank"><i class="fab fa-facebook-f"></i></a>
   				<a href="https://accounts.google.com/signin/v2/identifier?hl=en&continue=https%3A%2F%2Fmail.google.com%2Fmail&service=mail&ec=GAlAFw&flowName=GlifWebSignIn&flowEntry=AddSession" class="social" target="_blank"><i class="fab fa-google-plus-g"></i></a>
   			</div>
   			<input type="text" placeholder="Name" />
   			<input type="email" placeholder="Email" />
   			<input type="password" placeholder="Password" />
   			<button onclick=>Sign Up</button>
   		</form>
   	</div>
   	<div class="form-container sign-in-container">
   		<form action="#">
   			<h1>Sign in</h1>
   			<div class="social-container">
   				<a href="https://facebook.com" class="social" target="_blank"><i class="fab fa-facebook-f"></i></a>
   				<a href="https://accounts.google.com/signin/v2/identifier?hl=en&continue=https%3A%2F%2Fmail.google.com%2Fmail&service=mail&ec=GAlAFw&flowName=GlifWebSignIn&flowEntry=AddSession" class="social" target="_blank" rel="noopener noreferrer"><i class="fab fa-google-plus-g"></i></a>

   			</div>
   			<input type="text" placeholder="username" name="username"/>
   			<input type="password" placeholder="password" name="password"/>
   			<a href="forgetpassword">Forgot your password?</a>
   			<form action="https://google.com">
   			    <button>Sign In</button>
   			</form>
   		</form>
   	</div>
   	<div class="overlay-container">
   		<div class="overlay">
   			<div class="overlay-panel overlay-left">
   				<h2>WELCOME TO WECHAT</h2   >
   				 <br><br><br><br><br><br><br><br><br><br>
   				<button class="ghost" id="signIn">Sign In</button>
   			</div>
   			<div class="overlay-panel overlay-right">
   				<h2>WECHAT</h2>
   				 <br><br><br><br><br><br><br><br><br><br>
   				<button class="ghost" id="signUp">Sign Up</button>
   			</div>
   		</div>
   	</div>
   </div>

   <footer>
   	<p>
   		Created By : Azad Singh, Rushabh Rode and Krishna Singh
   	</p>
   </footer>
</body>
<script src="../../static/js/signup.js"></script>
</html>