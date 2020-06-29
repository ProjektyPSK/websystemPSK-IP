<%@page contentType="text/html" pageEncoding="UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>WEB SYSTEM</title>
    <link href="/css/style.css" rel="stylesheet" type="text/css">

</head>

<body>
<%@include file="header.jsp" %>
<div class="wrapper">
    <div class="box a">Welcome ${user.username}</div>
    <div class="box b">
        <div class="login-container">


            <form action="/user/home" method="GET">
                <input type="submit" value="Home Page"/>
            </form>
        </div>
    </div>
</div>
</body>

</html>