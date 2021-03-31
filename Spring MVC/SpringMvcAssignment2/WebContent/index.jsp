<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to Simple Interest Calculator</title>
</head>
<body>
	<form action="/SpringMvcAssignment2/simpleInterest.html">
	<table>
		<tr>
			<td><p>Amount</p></td>
			<td><input type="text" name="amount"/></td>
		</tr>
		<tr>
			<td><p>Years</p></td>
			<td><input type="text" name ="years"/></td>
		</tr>
		<tr>
			<td><p>Rate of Interest</p></td>
			<td><input type="text" name ="rateOfInterest"/></td>
		</tr>
		<tr>
			<td colSpan = "2">
			<input type="submit" name="Submit details">
			</td>
		</tr>
	</table>

</form>
</body>
</html>