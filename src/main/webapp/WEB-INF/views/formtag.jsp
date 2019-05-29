<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
body {
	background-color: tomato;
}
</style>

</head>
<body>
	<h1>Form tags</h1>

	<form:form action="formResponse" modelAttribute="student">

Fname:<form:input path="Fname" />

Lname:<form:input path="Lname" />

 
		<form:select path="country">
			<form:option value="Brazil" label="Brazil"></form:option>
			<form:option value="Canada" label="Canada"></form:option>
			<form:option value="India" label="India"></form:option>
			<form:option value="Britan" label="Britan"></form:option>

		</form:select>
<!--
		<form:select path="countryOptions">
			<form:options items="${student.countryOptions}" />


			<input type="submit" value="submit">


		</form:select> 
 -->
	</form:form>



</body>
</html>