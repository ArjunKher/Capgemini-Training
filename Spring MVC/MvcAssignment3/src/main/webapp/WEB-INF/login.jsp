<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ABC Login Page</title>
</head>
<body>
	<form action="/MvcAssignment3/submitLogin">
	
		<table>
		
			<tr> 
			    <td><h3>UserName</h3></td>
				<td><input type="text" name="username"/></td>
			</tr>
			<tr> 
			    <td><h3>Password</h3></td>
				<td><input type="text" name="password"/></td>
			</tr>
			<tr> 
			    <td colSpan="2"><input type="submit" title="Login"/></td>
			</tr>
		
		</table>
	
	</form>
</body>
</html>