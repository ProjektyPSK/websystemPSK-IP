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
    <div class="box a">Add new product</div>
    <div class="box b">
        <div class="login-container">
            <form modelAttribute="addproduct" action="/productProcess" method="POST">
                <input type="text" placeholder="Name" name="nameProduct"><br>
                <input type="text" placeholder="Type" name="type"><br>
                <input type="text" placeholder="Version" name="version"><br>
                <input type="text" placeholder="Description" name="description"><br>
                <input type="text" placeholder="Price" name="price"><br>
                <input type="text" placeholder="Product code" name="productCode"><br><br>
                <input type="submit" name="Submit"/>
                <button type="reset">Clear</button>

            </form>
        </div>
    </div>
</div>
</body>

</html>