<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Murach's Java Servlets and JSP</title>
    <link href="../styles/main.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<h1>Your Shopping Cart</h1>
<table>
    <tr>
        <th>Quantiry</th>
        <th>Description</th>
        <th>Price</th>
        <th>Amount</th>
        <th></th>
    </tr>
    <tr>
        <td><input type="text" value="1"> <input type="submit" value="Update"></td>
        <td>86 (the band) - True Life Songs and Pictures</td>
        <td class="align_right">$14.95</td>
        <td class="align_right">$14.95</td>
        <td><input type="submit" value="Remove Item"></td>
    </tr>
    <tr>
        <td><input type="text" value="1"> <input type="submit" value="Update"></td>
        <td>Paddlefoot - The first CD</td>
        <td class="align_right">$12.95</td>
        <td class="align_right">$12.95</td>
        <td><input type="submit" value="Remove Item"></td>
    </tr>
</table>
<br>
<p><b>To change the quantity.</b> enter the new quantity and click on the Update button.</p>
<br>
<input type="submit" value="Continue Shopping">
<br>
<br>
<input type="submit" value="Checkout">
</body>
</html>