<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<form:form action="processForm" method="POST" modelAttribute="theStudent">
	
	<table>
		<tr>
			<td>Enter FirstName : </td>
			<td><form:input path="firstname"/></td>
		</tr>
		
		<tr>
			<td>Enter LastName : </td>
			<td><form:input path="lastname"/></td>
		</tr>
		
		<tr>
			<td>Select Country : </td>
			<td><form:select path="country"></td>
				<td><form:options items="${theStudent.countryOptions}"/></td>
			<td></form:select></td>
		</tr>
		
		<tr>
			<td>Select favorite language :</td>
			<td>
				Java <form:radiobutton path="favoritelanguage" value="Java"/>
				Spring <form:radiobutton path="favoritelanguage" value="Spring"/>
				SpringBoot <form:radiobutton path="favoritelanguage" value="SpringBoot"/>
			</td>
		</tr>
		
		<tr>
			<td>Select Operating System : </td>
			<td> 
				Windows <form:checkbox path="operatingSystems" value="Windows"/> 
				Linux <form:checkbox path="operatingSystems" value="Linux"/> 
				Mac <form:checkbox path="operatingSystems" value="Mac"/> 
			</td>
		</tr>
		
		<tr><td><form:button name="submit">Submit</form:button></td></tr>
	</table>	
	
	</form:form>
	
	
</body>
</html>