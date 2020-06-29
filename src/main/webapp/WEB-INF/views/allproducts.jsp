<%@page contentType="text/html" pageEncoding="UTF-8" language="java" %>
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
    <div class="box d">
        <h2>All Products</h2>
        <table class="tableA">
            <tr>
                <td>Name</td>
                <td>Type</td>
                <td>Version</td>
                <td>Description</td>
                <td>Price</td>
                <td>Product code</td>
                <td>Buy now</td>
            </tr>
            <c:forEach items="${products}" var="s">
            <tr>
                <td>${s.nameProduct}</td>
                <td>${s.type}</td>
                <td>${s.version}</td>
                <td>${s.description}</td>
                <td>${s.price}</td>
                <td>${s.productCode}</td>
                <td> Buy now </td>

            </tr>
            </c:forEach>
        </table>

    </div>
    <div class="box a">Web System</div>
    <div class="box e">Web System</div>
    <div class="box f">Web System</div>
    <div class="box g">Web System</div>
    <div class="box h">Web System</div>
    <div class="box c">
        <ul>
            <li><a href="/user/home">Home</a></li>
            <li><a href="/user/showproducts">Show products</a></li>
            <li><a href="/user/addProduct">Add product</a></li>
        </ul>
    </div>
</div>
<div class="box">yoł</div>


</body>

</html>