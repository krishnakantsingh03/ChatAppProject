<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!Doctype html>
<html>

<head>
    <meta charset="UTF-8" />
    <title> Welcome to appname </title>
    <link href="../../static/css/style.css" type="text/css" rel="stylesheet" />
</head>

<body>
    <div class="parent clearfix">
        <div class="bg-illustration">
        </div>

        <div class="login">
            <div class="container">
                <h1>Login...</h1>

                <div class="login-form">
                    <form onsubmit="login(event)">
                        <input type="text" placeholder="Username" id="username" name="username">
                        <input type="password" placeholder="password" id="password" name="password">

                        <div class="remember-form">
                            <input type="checkbox">
                            <span>Remember me</span>
                        </div>
                        <div class="forget-pass">
                            <a href="#">Forgot Password ?</a>
                        </div>

                        <button type="submit">LOG-IN</button>
                    </form>
                </div>

            </div>
        </div>
    </div>
</body>
<script src="../../static/js/user.js"></script>
</html>