<%@page contentType="text/html;charset=UTF-8"%>
<%@page pageEncoding="UTF-8"%>
<%@ page session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html;charset=UTF-8" />
		<title>@Controller Example</title>	
	</head>	
	<body>
		<div class="container">
			<h1>
				View Account
			</h1>
			<div class="span-12 last">	
				<form:form modelAttribute="account" action="${account.id}" method="post">
				  	<fieldset>		
						<legend>Account Fields</legend>
						<p>
							<form:label	for="name" path="name">Name</form:label><br/>
							<form:input path="name" readonly="true"/>		
						</p>
						<p>	
							<form:label for="email" path="email" cssErrorClass="error">email</form:label><br/>
							<form:input path="email" /> <form:errors path="email" />
						</p>
						<p>
							<form:label for="firstName" path="firstName" cssErrorClass="error">firstName</form:label><br/>
							<form:input path="firstName" /> <form:errors path="firstName" />
						</p>
						<p>
							<form:label for="lastName" path="lastName" cssErrorClass="error">lastName</form:label><br/>
							<form:input path="lastName" /> <form:errors path="lastName" />
						</p>
						<p>
							<form:label for="contactNo" path="contactNo" cssErrorClass="error">ContactNo</form:label><br/>
							<form:input path="contactNo" /> <form:errors path="contactNo"/>
						</p>
						<p>
							<form:label for="role" path="role" cssErrorClass="error">role</form:label><br/>
							<form:input path="role" /> <form:errors path="role" />
						</p>
						
					</fieldset>
				</form:form>
			</div>
			<hr>	
			<ul>
				<li> <a href="?locale=en_us">us</a> |  <a href="?locale=en_gb">gb</a> | <a href="?locale=es_es">es</a> | <a href="?locale=de_de">de</a> </li>
			</ul>	
		</div>
	</body>
</html>