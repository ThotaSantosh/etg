<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form>
<label>Enter User Name </label>
		<br>
		<br>
		<form:input path="name" />
		<br>
		<br>
		<label>Enter Email </label>
		<br>
		<br>
		<form:input path="email" />
		<br>
		<label>Enter Password </label>
		<br>
		<br>
		<form:input path="password" />
		<br>
		<br>
		<input type="submit" value="Register">
		<br>
		</form>
</body>
</html>