<%@page import="com.app.model.UniversityResult"%>

<%

UniversityResult u =(UniversityResult)request.getAttribute("result");

%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Result</title>
</head>

<body>

	<h2>Update Student Result</h2>

	<form action="updatestudent" method="post">

		PRN : <input type="number" name="prn" value="<%=u.getPrn()%>" readonly>

		<br>
		<br> Name : <input type="text" name="name" value="<%=u.getName()%>" readonly> <br>
		
		<br> Math : <input type="number" name="math" value="<%=u.getMath()%>"> <br>
		
		<br> English : <input type="number" name="english" value="<%=u.getEnglish()%>"> <br>
		
		<br> Physics : <input type="number" name="physics" value="<%=u.getPhysics()%>"> <br> 
		
		<br> Chemistry : <input type="number" name="chemistry" value="<%=u.getChemistry()%>"> <br>
		<br>

		<button type="submit">Update Result</button>

	</form>

</body>
</html>