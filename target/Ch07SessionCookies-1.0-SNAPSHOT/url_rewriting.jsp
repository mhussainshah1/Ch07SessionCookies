<%--
  Created by IntelliJ IDEA.
  User: Owner
  Date: 7/3/2021
  Time: 7:03 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>URL ReWriting</title>
</head>
<body>
    <%--link--%>
    <a href="cart?productCode=8601">Add To Cart</a> <%--one parameter--%>
    <a href="download?action=checkUser&amp;productCode=8601">Download</a> <%--two parameters--%>

    <%--Form tag--%>
    <form action="cart?productCode=jr01" method="post">
        <input type="submit" value="Add To Cart">
    </form>
    <%--link uses EL--%>
    <a href="cart?productCode=${productCode}">Add To Cart</a>

</body>
</html>
