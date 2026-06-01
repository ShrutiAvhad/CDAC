<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.app.dao.StudentDao"%>
<%@page import="com.app.bean.Student"%>

<%
String msg = "";

if (request.getMethod().equalsIgnoreCase("POST")) {

	int id = Integer.parseInt(request.getParameter("id"));

	String fname = request.getParameter("fname");

	Student s = StudentDao.login(id, fname);

	if (s != null) {

		session.setAttribute("student", s);

		response.sendRedirect("db.jsp");
	} else {

		msg = "Invalid Login";
	}
}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>

<style>

*{
	margin:0;
	padding:0;
	box-sizing:border-box;
	font-family:Arial, sans-serif;
}

body{
	height:100vh;
	display:flex;
	justify-content:center;
	align-items:center;
	background:linear-gradient(to right, #87CEEB, #B0E0E6);
}

.login-card{
	background:white;
	padding:40px;
	width:400px;
	border-radius:15px;
	box-shadow:0 5px 15px rgba(0,0,0,0.2);
	text-align:center;
}

.login-card h1{
	margin-bottom:25px;
	color:#0077b6;
}

.input-group{
	margin:15px 0;
	text-align:left;
}

.input-group label{
	font-weight:bold;
	color:#555;
	display:block;
	margin-bottom:5px;
}

.input-group input{
	width:100%;
	padding:10px;
	border:1px solid #90e0ef;
	border-radius:8px;
	font-size:16px;
	outline:none;
}

.input-group input:focus{
	border-color:#00b4d8;
	box-shadow:0 0 5px rgba(0,180,216,0.5);
}

.login-btn{
	width:100%;
	padding:12px;
	background:#00b4d8;
	color:white;
	border:none;
	border-radius:8px;
	font-size:18px;
	font-weight:bold;
	cursor:pointer;
	transition:0.3s;
	margin-top:15px;
}

.login-btn:hover{
	background:#0096c7;
	transform:scale(1.03);
}

.message{
	color:#d00000;
	margin-top:15px;
	font-weight:bold;
}

.register-link{
	display:block;
	margin-top:20px;
	text-decoration:none;
	color:#0077b6;
	font-weight:bold;
}

.register-link:hover{
	text-decoration:underline;
}

</style>

</head>

<body>

	<div class="login-card">

		<h1>Student Login</h1>

		<form method="post">

			<div class="input-group">
				<label>Student ID :</label>
				<input type="number" name="id" required>
			</div>

			<div class="input-group">
				<label>First Name :</label>
				<input type="text" name="fname" required>
			</div>

			<input type="submit" value="Login" class="login-btn">

		</form>

		<h3 class="message"><%=msg%></h3>

		<a href="register.jsp" class="register-link">
			New Student Registration
		</a>

	</div>

</body>
</html>