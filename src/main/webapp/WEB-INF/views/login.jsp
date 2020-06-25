<%@page contentType="text/html" pageEncoding="UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>My App</title>
    <link href="/css/style.css" rel="stylesheet" type="text/css">

</head>

<body>
<div class="wrapper">
    <div class="box a">Web System</div>
    <div class="box b">
        <div class="login-container">
            <form action="/login" method="POST">
                <input type="text" placeholder="username" name="username"><br>
                <input type="password" placeholder="Password" name="password"><br>
                <input type="submit" name="submit"/>
                <button type="reset">Clear</button>
            </form>
        </div>
    </div>
</div>
</body>

</html>