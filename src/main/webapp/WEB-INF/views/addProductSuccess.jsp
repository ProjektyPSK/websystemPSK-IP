<%@page contentType="text/html" pageEncoding="UTF-8" language="java" %>
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
    <div class="box a">Product Added Successfully</div>
        <div class="box b">
            <form action="/user/home" method="GET">
                <input type="submit" value="Home Page"/>
            </form>
            <form action="/user/addProduct" method="GET">
                <input type="submit" value="Add next product"/>
            </form>
        </div>
    </div>
</div>
</body>

</html>