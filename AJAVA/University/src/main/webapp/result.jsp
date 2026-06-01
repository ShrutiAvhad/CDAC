<%@page import="com.app.model.UniversityResult"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
UniversityResult u = (UniversityResult) request.getAttribute("result");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Result</title>

<style>
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
	font-family: "Poppins", sans-serif;
}

body {
	min-height: 100vh;
	display: flex;
	justify-content: center;
	align-items: center;
	background: linear-gradient(135deg, #ffd6e8, #ffc2d1, #f8b4d9);
	background-size: 300% 300%;
	animation: bgMove 8s ease infinite;
}

.container {
	width: 500px;
	padding: 40px;
	border-radius: 30px;
	background: rgba(255, 255, 255, 0.35);
	backdrop-filter: blur(14px);
	border: 2px solid rgba(255, 255, 255, 0.4);
	box-shadow: 0 10px 35px rgba(255, 105, 180, 0.25), 0 0 20px rgba(255, 255, 255, 0.3);
}

h1 {
	text-align: center;
	color: #c2185b;
	margin-bottom: 30px;
}

table {
	width: 100%;
	border-collapse: collapse;
	background: rgba(255, 255, 255, 0.55);
	border-radius: 20px;
	overflow: hidden;
}

td {
	padding: 16px;
	border-bottom: 1px solid white;
}

td:first-child {
	font-weight: 600;
	color: #ad1457;
}
</style>

</head>

<body>

	<div class="container">

		<h1>Student Result</h1>

		<table>

			<tr>
				<td>PRN</td>
				<td><%=u.getPrn()%></td>
			</tr>

			<tr>
				<td>Name</td>
				<td><%=u.getName()%></td>
			</tr>

			<tr>
				<td>Math</td>
				<td><%=u.getMath()%></td>
			</tr>

			<tr>
				<td>English</td>
				<td><%=u.getEnglish()%></td>
			</tr>

			<tr>
				<td>Physics</td>
				<td><%=u.getPhysics()%></td>
			</tr>

			<tr>
				<td>Chemistry</td>
				<td><%=u.getChemistry()%></td>
			</tr>

			<tr>
				<td>Total</td>
				<td><%=u.getTotal()%></td>
			</tr>

			<tr>
				<td>Percentage</td>
				<td><%=u.getPercentage()%>%</td>
			</tr>

			<tr>

				<td>Status</td>

				<td>
					<%
					if (u.getPercentage() >= 35)
					{
						out.print("Pass");
					} else {
						out.print("Fail");
					}
					%>
				</td>
			</tr>
		</table>
	</div>

</body>
</html>