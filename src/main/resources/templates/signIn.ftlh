<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" type="text/css" href="./css/sign-up.css">
    <title>Login</title>
</head>
<body>
<div class="body-wrapper">
    <div class="main">
        <h2 class="main_title">Вход</h2>
        <div class="main_form-wrapper">
            <form class="form" method="post" action="/signIn">
                <input name="email" type="email" placeholder="Email"/>
                <input name="password" type="password" placeholder="Password"/>
                <input type="checkbox" name="remember-me" >Remember me
                <input type="submit" value="Sign up"/>
                <a href="/signUp">У меня еще нет аккаунта</a>
            </form>
        </div>
    </div>
</div>


</body>
</html>