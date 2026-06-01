<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Visitor Counter</title>
</head>
<body>

	<%! int Count = 1; %>
	
	<% Count++; %>
	
	<%= "Visitor Count = " + Count %>
	
	<br><br>
	
	<%= (65 > 57) %>

</body>
</html>