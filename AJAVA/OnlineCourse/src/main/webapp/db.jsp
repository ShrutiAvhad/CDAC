<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.app.bean.Student"%>

<%
Student s = (Student) session.getAttribute("student");

if (s == null) {

	response.sendRedirect("login.jsp");
	return;
}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dash-board</title>

<style>

*{
	margin:0;
	padding:0;
	box-sizing:border-box;
	font-family:Arial, sans-serif;
}

body{
	background:linear-gradient(to right, #87CEEB, #B0E0E6);
	height:100vh;
	display:flex;
	justify-content:center;
	align-items:center;
}

.dashboard-card{
	background:white;
	padding:40px;
	width:400px;
	border-radius:15px;
	box-shadow:0 4px 15px rgba(0,0,0,0.2);
	text-align:center;
}

.dashboard-card h1{
	color:#0077b6;
	margin-bottom:20px;
}

.dashboard-card h2{
	color:#555;
	margin:15px 0;
}

.dashboard-card h3{
	color:#666;
	margin-top:20px;
	font-size:16px;
}

.logout-btn{
	display:inline-block;
	margin-top:25px;
	padding:10px 25px;
	background:#00b4d8;
	color:white;
	text-decoration:none;
	border-radius:8px;
	font-weight:bold;
	transition:0.3s;
}

.logout-btn:hover{
	background:#0096c7;
	transform:scale(1.05);
}

</style>

</head>

<body>

	<div class="dashboard-card">

		<h1>
			Welcome <%=s.getFirstName()%>
		</h1>

		<h2>
			Course : <%=s.getCourse()%>
		</h2>

		<h2>
			Age : <%=s.getAge()%>
		</h2>

		<h3>
			Session ID : <%=session.getId()%>
		</h3>

		<a href="logout.jsp" class="logout-btn">Logout</a>

	</div>

</body>
</html>