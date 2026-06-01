<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page import="com.app.dao.StudentDao"%>
<%@page import="com.app.bean.Student"%>

<%
String msg = "";

if (request.getMethod().equalsIgnoreCase("POST")) {

	String fname = request.getParameter("fname");
	String lname = request.getParameter("lname");
	int age = Integer.parseInt(request.getParameter("age"));
	String course = request.getParameter("course");

	Student s = new Student();

	s.setFirstName(fname);
	s.setLastName(lname);
	s.setAge(age);
	s.setCourse(course);

	int status = StudentDao.save(s);

	if (status > 0) {

		msg = "Registration Successful";

		// Optional Redirect
		// response.sendRedirect("login.jsp");

	} else {

		msg = "Registration Failed";
	}
}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>

<style>
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
	font-family: Arial, sans-serif;
}

body {
	height: 100vh;
	display: flex;
	justify-content: center;
	align-items: center;
	background: linear-gradient(to right, #87CEEB, #B0E0E6);
}

.register-card {
	background: white;
	padding: 40px;
	width: 420px;
	border-radius: 15px;
	box-shadow: 0 5px 15px rgba(0, 0, 0, 0.2);
	text-align: center;
}

.register-card h1 {
	margin-bottom: 25px;
	color: #0077b6;
}

.input-group {
	margin: 15px 0;
	text-align: left;
}

.input-group label {
	display: block;
	margin-bottom: 5px;
	font-weight: bold;
	color: #555;
}

.input-group input, .input-group select {
	width: 100%;
	padding: 10px;
	border: 1px solid #90e0ef;
	border-radius: 8px;
	font-size: 16px;
	outline: none;
}

.input-group input:focus, .input-group select:focus {
	border-color: #00b4d8;
	box-shadow: 0 0 5px rgba(0, 180, 216, 0.5);
}

.register-btn {
	width: 100%;
	padding: 12px;
	background: #00b4d8;
	color: white;
	border: none;
	border-radius: 8px;
	font-size: 18px;
	font-weight: bold;
	cursor: pointer;
	transition: 0.3s;
	margin-top: 15px;
}

.register-btn:hover {
	background: #0096c7;
	transform: scale(1.03);
}

.message {
	margin-top: 15px;
	font-weight: bold;
	color: green;
}

.login-link {
	display: block;
	margin-top: 20px;
	text-decoration: none;
	color: #0077b6;
	font-weight: bold;
}

.login-link:hover {
	text-decoration: underline;
}
</style>

</head>

<body>

	<div class="register-card">

		<h1>Student Registration</h1>

		<form action="register.jsp" method="post">

			<div class="input-group">
				<label>First Name :</label> <input type="text" name="fname" required>
			</div>

			<div class="input-group">
				<label>Last Name :</label> <input type="text" name="lname" required>
			</div>

			<div class="input-group">
				<label>Age :</label> <input type="number" name="age" required>
			</div>

			<div class="input-group">

				<label>Course :</label> <select name="course">

					<option>PGCP-AC</option>
					<option>CDAC</option>
					<option>CET</option>
					<option>MBA</option>
					<option>MTech</option>

				</select>

			</div>

			<input type="submit" value="Register" class="register-btn">

		</form>

		<h3 class="message"><%=msg%></h3>

		<a href="login.jsp" class="login-link"> Already Registered? Login
		</a>

	</div>

</body>
</html>