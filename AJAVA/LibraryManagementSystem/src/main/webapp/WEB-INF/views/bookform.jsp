<%@ taglib prefix="form" uri="jakarta.tags.core"%>

<html>
<body>

	<h2>Add Book</h2>

	<form:form action="saveBook" modelAttribute="book" method="post">

    Title:
    <form:input path="title" />

    Author:
    <form:input path="author" />

    Category:
    <form:input path="category" />
		

    Available:
    <form:checkbox path="available" />
		

		<input type="submit" value="Save">

	</form:form>

</body>
</html>