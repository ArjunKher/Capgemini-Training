<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Log-In</title>
</head>
<body>
	<h2>ENTER LOGIN CREDENTIALS</h2>
	<form action="/RestAssignment2/auth.html">
		<table>
			<tr>
				<td>Username</td>
				<td><input type="text" name="username"/></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password"/></td>
			</tr>
			<tr>
				<td colspan="2">
				<button type="submit">Submit</button>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>