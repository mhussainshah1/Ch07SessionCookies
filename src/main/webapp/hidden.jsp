<%--
  Created by IntelliJ IDEA.
  User: Owner
  Date: 7/3/2021
  Time: 7:18 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hidden</title>
</head>
<body>
<%--hidden text field--%>
<form action="cart" method="post">
    <input type="submit" value="Add To Cart">
    <input type="hidden" name="productCode" value="8601">
</form>

<%--EL to set hidden field values--%>
<form action="cart" method="post">
    <input type="hidden" name="productCode" value="${product.code}">
    <input type="text" size="2" name="quantity" value="${lineItem.quantity}">
    <input type="submit" name="updateButton" value="Update">
</form>
</body>
</html>
