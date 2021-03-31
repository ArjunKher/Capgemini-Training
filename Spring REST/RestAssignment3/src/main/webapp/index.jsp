<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Country Information</title>
</head>
<body>
	<h2>Enter the ZIP CODE!</h2>
	<form action="/RestAssignment3/getCountry">
		<table>
		<tr>
			<td>Zipcode</td>
			<td><input type="text" name = "code"/></td>
		</tr>
		<tr>
		<td colspan="2"><button type="submit">Get Country</button></td>
		</tr>
		</table>
	</form>
</body>
</html>