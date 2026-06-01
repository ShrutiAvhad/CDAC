<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>

<head>

<meta charset="UTF-8">

<title>Home</title>

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

.home-card {
	background: white;
	padding: 50px;
	width: 400px;
	text-align: center;
	border-radius: 15px;
	box-shadow: 0 5px 15px rgba(0, 0, 0, 0.2);
}

.home-card h1 {
	color: #0077b6;
	margin-bottom: 30px;
	font-size: 28px;
}

.btn {
	display: block;
	width: 100%;
	padding: 12px;
	margin: 15px 0;
	text-decoration: none;
	color: white;
	font-size: 18px;
	font-weight: bold;
	border-radius: 8px;
	transition: 0.3s;
}

.register-btn {
	background: #00b4d8;
}

.register-btn:hover {
	background: #0096c7;
	transform: scale(1.03);
}

.login-btn {
	background: #48cae4;
}

.login-btn:hover {
	background: #00b4d8;
	transform: scale(1.03);
}
</style>

</head>

<body>

	<div class="home-card">

		<h1>Online Course Registration System</h1>

		<a href="register.jsp" class="btn register-btn"> Register </a>
		<a href="login.jsp" class="btn login-btn"> Login </a>

	</div>

</body>
</html>