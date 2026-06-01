<%@page import="com.app.model.UniversityResult"%>

<%
UniversityResult u =
(UniversityResult)request.getAttribute("result");
%>

<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<meta name="viewport"
content="width=device-width, initial-scale=1.0">

<title>Update Result</title>

<style>

*{
	margin: 0;
	padding: 0;
	box-sizing: border-box;
	font-family: "Poppins", sans-serif;
}

body{
	min-height: 100vh;
	display: flex;
	justify-content: center;
	align-items: center;

	background: linear-gradient(
	135deg,
	#d4fc79,
	#96e6a1,
	#a8edea);

	background-size: 300% 300%;
	animation: bgMove 8s ease infinite;
}

.update-card{

	width: 500px;
	padding: 45px 40px;
	border-radius: 30px;

	background: rgba(255,255,255,0.35);

	backdrop-filter: blur(15px);

	border: 2px solid rgba(255,255,255,0.4);

	box-shadow:
	0 10px 35px rgba(0,0,0,0.15),
	0 0 20px rgba(255,255,255,0.3);
}

form{
	display: flex;
	flex-direction: column;
}

h2{
	text-align: center;
	font-size: 34px;
	color: #1b5e20;
	margin-bottom: 35px;
}

label{
	margin-top: 14px;
	margin-bottom: 8px;
	font-weight: 600;
	color: #2e7d32;
}

input{
	padding: 14px;
	border: none;
	border-radius: 14px;
	font-size: 15px;
	outline: none;

	background: rgba(255,255,255,0.85);
}

input[readonly]{
	background: rgba(230,230,230,0.9);
	color: #555;
	cursor: not-allowed;
}

button{
	margin-top: 30px;
	padding: 14px;
	font-size: 17px;
	font-weight: 600;
	color: white;
	border: none;
	border-radius: 50px;
	cursor: pointer;
	transition: 0.3s;

	background: linear-gradient(
	135deg,
	#43a047,
	#1b5e20);
}

button:hover{
	transform: translateY(-4px);
	box-shadow: 0 8px 18px rgba(0,0,0,0.2);
}

@keyframes bgMove{
	0%{
		background-position: 0% 50%;
	}
	50%{
		background-position: 100% 50%;
	}
	100%{
		background-position: 0% 50%;
	}
}

</style>

</head>

<body>

<div class="update-card">

<h2>Update Student Result</h2>

<form action="updateteacher" method="post">

<label>PRN :</label>

<input type="number"
       name="prn"
       value="<%=u.getPrn()%>"
       readonly>

<label>Name :</label>

<input type="text"
       name="name"
       value="<%=u.getName()%>"
       readonly>

<label>Math :</label>

<input type="number"
       name="math"
       value="<%=u.getMath()%>">

<label>English :</label>

<input type="number"
       name="english"
       value="<%=u.getEnglish()%>">

<label>Physics :</label>

<input type="number"
       name="physics"
       value="<%=u.getPhysics()%>">

<label>Chemistry :</label>

<input type="number"
       name="chemistry"
       value="<%=u.getChemistry()%>">

<button type="submit">
Update Result
</button>

</form>

</div>

</body>
</html>