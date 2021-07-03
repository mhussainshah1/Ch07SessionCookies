<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Servlet</title>
    <link rel="stylesheet" href="styles/main.css" type="text/css"/>
</head>
<body>

<h1>Download Registration</h1>

<p>To register for our downloads, enter your name and email address below. Then, click on the Submit button.</p>

<form action="download" method="post">
    <input type="hidden" name="action" value="registerUser">

    <label for="email" class="pad_top">Email:</label>
    <input id="email" type="email" name="email" value="${user.email}"><br>

    <label for="firstName" class="pad_top">First Name:</label>
    <input id="firstName" type="text" name="firstName" value="${user.firstName}"><br>

    <label for="lastName" class="pad_top">Last Name:</label>
    <input id="lastName" type="text" name="lastName" value="${user.lastName}"><br>

    <label>&nbsp;</label>
    <input type="submit" value="Register" class="margin_left">
</form>

</body>

</html>
