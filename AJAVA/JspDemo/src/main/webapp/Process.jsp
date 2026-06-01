<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Process Page</title>
</head>
<body>

	<%
		String unm = request.getParameter("txtUserName");
		String pwd = request.getParameter("txtPassword");

		if(unm.equals("admin") && pwd.equals("admin123"))
		{
			out.write("Login Successful");
		}
		else
		{
			response.sendRedirect("login.jsp");
		}
	%>

</body>
</html>