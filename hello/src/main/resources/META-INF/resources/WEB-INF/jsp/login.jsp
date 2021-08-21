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
   				<a href="#" class="social"><i class="fab fa-facebook-f"></i></a>
   				<a href="#" class="social"><i class="fab fa-google-plus-g"></i></a>
   				<a href="#" class="social"><i class="fab fa-linkedin-in"></i></a>
   			</div>
   			<span>or use your email for registration</span>
   			<input type="text" placeholder="Name" />
   			<input type="email" placeholder="Email" />
   			<input type="password" placeholder="Password" />
   			<button>Sign Up</button>
   		</form>
   	</div>
   	<div class="form-container sign-in-container">
   		<form action="#">
   			<h1>Sign in</h1>
   			<div class="social-container">
   				<a href="#" class="social"><i class="fab fa-facebook-f"></i></a>
   				<a href="#" class="social"><i class="fab fa-google-plus-g"></i></a>
   				<a href="#" class="social"><i class="fab fa-linkedin-in"></i></a>
   			</div>
   			<span>or use your account</span>
   			<input type="email" placeholder="email" />
   			<input type="password" placeholder="password" />
   			<a href="#">Forgot your password?</a>
   			<button>Sign In</button>
   		</form>
   	</div>
   	<div class="overlay-container">
   		<div class="overlay">
   			<div class="overlay-panel overlay-left">
   				<h1>Welcome Back!</h1>
   				<p>To keep connected with us please login with your personal info</p>
   				<button class="ghost" id="signIn">Sign In</button>
   			</div>
   			<div class="overlay-panel overlay-right">
   				<h1>QUICK CHAT</h1>
   				<p>Enter your personal details and start journey with us</p>
   				<button class="ghost" id="signUp">Sign Up</button>
   			</div>
   		</div>
   	</div>
   </div>

   <footer>
   	<p>
   		Created By Azad Singh, Rushabh Rode and Krishna Singh
   	</p>
   </footer>
</body>
<script src="../../static/js/signup.js"></script>
</html>