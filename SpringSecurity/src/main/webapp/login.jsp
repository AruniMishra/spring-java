<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to Spring Security</title>
</head>
<body>
	<h1>Please login</h1>

	${SPRING_SECURITY_LAST_EXCEPTION.message}

	<form action="login" method="POST">

		<table>
			<tr>
				<td>User name:<input type="text" name="username" value=''>
				</td>
			</tr>
			<tr>
				<td>Password:<input type="password" name="password" value=''>
				</td>
			</tr>
			<tr>
				<td><input type="submit" name="submit" value='Login'>
				</td>
			</tr>
		</table>

	</form>

</body>
</html>