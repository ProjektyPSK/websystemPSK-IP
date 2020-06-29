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
    <div class="box a">Web System Administrator Registration</div>
    <div class="box b">
        <div class="login-container">
            <form modelAttribute="user" action="registrationProcess" method="POST">
                <input type="text" placeholder="Name" name="name"><br>
                <input type="text" placeholder="Surname" name="surname"><br>
                <input type="text" placeholder="User name" name="username"><br>
                <input type="password" placeholder="Password" name="password"><br><br><br>
                <a>Contact</a><br><br>
                <input type="tel" placeholder="Phone number" name="phoneNumber"><br>
                <input type="text" placeholder="Fax number" name="faxNumber"><br>
                <input type="email" placeholder="E-mail" name="email"><br>
                <input type="url" placeholder="My site" name="mySite"><br><br><br>
                <a>Address</a><br><br>
                <input type="text" placeholder="City" name="city"><br>
                <input type="text" placeholder="Province" name="province"><br>
                <input type="text" placeholder="Country" name="country"><br>
                <input type="text" placeholder="Post code" name="postCode"><br>
                <input type="text" placeholder="Street" name="street"><br>
                <input type="text" placeholder="House number" name="houseNumber"><br>
                <input type="text" placeholder="Apartment number" name="apartmentNumber"><br><br><br>
                <a>Role</a><br><br>
                <input type="radio" id="User" placeholder="checkbox" name="role" value="ADMIN" checked="checked">
                <label for="User">ADMIN</label><br><br><br>
                <input type="submit" name="Registration"/>
                <button type="reset">Clear</button>

            </form>
        </div>
    </div>
</div>
</body>

</html>