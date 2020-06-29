<%@page contentType="text/html" pageEncoding="UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>WEB SYSTEM</title>
    <link href="/css/loginstyle.css" rel="stylesheet" type="text/css">

</head>

<body>
<div class="wrapper">
    <div class="box a">Web System</div>
    <div class="box b">
        <div class="login-container">
            <form action="/user/home" method="post">
<%--                <input type="hidden" name="action" value="sendemailWhenAddNewProduct">--%>
                <input type="text" placeholder="username" name="username"><br>
                <input type="password" placeholder="Password" name="password"><br>
                <input type="submit" name="submit"/>
                <button type="reset">Clear</button>
<%--                <a href="/registration" methods="post">Sign In</a>--%>
            </form>

            <form action="/showRegistrationPage" method="post">
                <input type="submit" value="Sign In"/>
            </form>
        </div>
    </div>
</div>
</body>

</html>