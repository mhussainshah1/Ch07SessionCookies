<%--
  Created by IntelliJ IDEA.
  User: Owner
  Date: 7/3/2021
  Time: 6:02 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Cookie</title>
    <link rel="stylesheet" href="../styles/main.css" type="text/css"/>
</head>
<body>
<h1>Cookies</h1>
<p>Here's table with all of the cookies that this browser is sending to the current server.</p>
<table>
    <tr>
        <th>Name</th>
        <th>Value</th>
    </tr>
    <c:forEach var="c" items="${cookie}">
        <tr>
            <td>${c.value.name}</td>
            <td>${c.value.value}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
