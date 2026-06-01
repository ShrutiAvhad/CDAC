<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Table Program</title>
</head>
<body>

	<form action="index.jsp" method="post">

		Enter Number : <input type="text" name="txtNum"> <input
			type="submit" value="Show Table">

	</form>

	<br>
	<br>

	<%
	String num = request.getParameter("txtNum");

	if (num != null) {
		int no = Integer.parseInt(num);
	%>

	<table border="1">

		<%
		for (int i = 1; i <= 10; i++) {
		%>

		<tr>
			<td><%=no%></td>
			<td>*</td>
			<td><%=i%></td>
			<td>=</td>
			<td><%=no * i%></td>
		</tr>

		<%
		}
		%>

	</table>

	<%
	}
	%>

</body>
</html>