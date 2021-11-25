<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
	<head>
		<title>Account</title>
		<style>
			.error {
				color: #ff0000;
				font-weight: bold;
			}
		</style>
	</head>
	<body>
		<table border="1">
			<tr>
				<th>Id</th>
				<th>name</th>
				<th>email</th>
				<th>firstName</th>
				<th>lastName</th>
				<th>Contact no</th>
				<th>role</th>
			</tr>
			<tr>
				<td>${account.id}</td>
				<td>${account.name}</td>
				<td>${account.email}</td>
				<td>${account.firstName}</td>
				<td>${account.lastName }</td>
				<td>${account.contactNo }</td>
				<td>${account.role }</td>
				
			</tr>
		</table>
		<br/>
		<a href="..">Home</a>
	</body>
</html>