<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="header.jsp" %><br><br>
	User-agent: <%= request.getHeader("User-agent") %><br><br>
	Locale:<%= request.getLocale() %><br><br>
	<%@include file="footer.jsp" %>
</body>
</html>