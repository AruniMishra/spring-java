<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring Boot MVC</title>
</head>
<body>
	Welcome to Spring Boot MVC
	<hr>

	<form action="addAlien" method="post">
		<!-- Enter value a : <input type="text" name ="num1"><br>
		Enter value b : <input type="text" name ="num2"><br><br> -->
		Enter value id : <input type="text" name="id"><br> Enter
		value name : <input type="text" name="name"><br> <input
			type="submit">
	</form>

	<hr>
	Search all aliens:
	<br>
	<form action="getAliens" method="get">
		<input type="submit">
	</form>


	<hr>
	Search by id:
	<br>
	<form action="getAlien" method="get">
		Enter value id : <input type="text" name="id"><br> <input
			type="submit">
	</form>
	
	<hr>
	Search by name:
	<br>
	<form action="getAlienByName" method="get">
		Enter value name : <input type="text" name="name"><br> <input
			type="submit">
	</form>


</body>
</html>