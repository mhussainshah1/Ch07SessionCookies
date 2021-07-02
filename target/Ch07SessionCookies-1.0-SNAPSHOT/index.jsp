<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Murach's Java Servlets and JSP</title>
    <link rel="stylesheet" href="styles/main.css" type="text/css"/>
</head>
<body>
<h1>CD list</h1>
    <table>
        <tr>
            <th>Description</th>
            <th>Price</th>
            <th></th>
        </tr>
        <tr>
            <td>86 (the band) - True Life Songs and Pictures</td>
            <td class="align_right">$14.95</td>
            <td><input type="submit" value="Add To shopping Cart"></td>
        </tr>
        <tr>
            <td>Paddlefoot-The first CD</td>
            <td class="align_right">$12.95</td>
            <td><input type="submit" value="Add To shopping Cart"></td>
        </tr>
        <tr>
            <td>Paddlefoot - The second CD</td>
            <td class="align_right">$14.95</td>
            <td><input type="submit" value="Add To shopping Cart"></td>
        </tr>
        <tr>
            <td>Joe Rut - Genuine Wood Grained Finish</td>
            <td>$14.95</td>
            <td><input type="submit" value="Add To shopping Cart"></td>
        </tr>
    </table>

<p><a href="session?productCode=8601">Session</a></p>
<p><a href="enumeration">Enumeration</a></p>
<p><a href="cookieResponse">Cookie</a></p>
<p><a href="invalidate">Invalidate Session</a></p>
</body>
</html>