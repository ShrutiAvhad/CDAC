<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="todolist.jsp" method="Post">
		Enter an item : 
		<input type="text" name="theItem">
		
		<input type="submit" value="Add">
	</form>

	<%
		List<String> list = (List<String>)
		session.getAttribute("mytodolist");
		
		if(list == null)
		{
			list = new ArrayList<String>();
			session.setAttribute("mytodolist",list);	
		}
		
		String item = request.getParameter("theItem");
		
	%>
	
</body>
</html>