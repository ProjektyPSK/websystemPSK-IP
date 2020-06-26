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
<div class="wrapper">
    <div class="box a">Web System Registration</div>
    <div class="box b">
        <div class="login-container">
            <form action="/registration" method="post">
                <input type="text" placeholder="Name" name="name"><br>
                <input type="text" placeholder="Last name" name="lastname"><br>
                <input type="text" placeholder="User name" name="username"><br>
                <input type="password" placeholder="Password" name="password"><br><br><br>
                <a>Contact</a><br><br>
                <input type="number" placeholder="Phone number" name="phonenumber"><br>
                <input type="text" placeholder="Fax number" name="faxnumber"><br>
                <input type="email" placeholder="e-mail" name="email"><br>
                <input type="url" placeholder="My site" name="site"><br><br><br>
                <a>Address</a><br><br>
                <input type="text" placeholder="City" name="city"><br>
                <input type="text" placeholder="province" name="province"><br>
                <input type="text" placeholder="Country" name="country"><br>
                <input type="text" placeholder="Post code" name="postcode"><br>
                <input type="text" placeholder="Street" name="street"><br>
                <input type="text" placeholder="House number" name="housenumber"><br>
                <input type="text" placeholder="Apartment number" name="apartmentnumber"><br><br><br>
                <a>Role</a><br><br>
                <input type="radio" id="User" placeholder="checkbox" name="role" value="USER">
                <label for="User">User</label><br><br><br>
                <input type="submit" name="submit"/>
                <button type="reset">Clear</button>

            </form>
        </div>
    </div>
</div>
</body>

</html>