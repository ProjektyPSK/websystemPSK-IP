<%@page contentType="text/html" pageEncoding="UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

<head>
     <script src="menu.js"></script>
     <meta charset="UTF-8">
     <title>My App</title>
     <link href="${pageContext.request.contextPath}/style.css" rel="stylesheet" type="text/css">

</head>

<body>
     <div class="wrapper">
          <div class="box c">
               <dl id="menu0">
                    <dt>Project</dt>
                    <dd>
                         <dl>
                              <dt> <a href="application?action=showAllproject">Projects</a></dt>
                              <dt> <a href="createnewproject.jsp">Create new project</a></dt>
                         </dl>
                    </dd>
                    <dt></dt>
                    <dt>User</dt>
                    <script>
                         new Menu('menu0');
                    </script>
          </div>
          <div class="box d">
               <div class="box e">Project Management
               </div>
          </div>
          <%@include file="footer.jsp" %>


</body>

</html>