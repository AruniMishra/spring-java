<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login here</title>
</head>
<body>
	<form action="/spring-mvc/login" method="POST">
	<p><font color="red">${error}</font></p>
		Name:<input type="text" name="name">
		Password:<input type="password" name="password"> <br><br>
		<input type="submit">
	</form>
</html>