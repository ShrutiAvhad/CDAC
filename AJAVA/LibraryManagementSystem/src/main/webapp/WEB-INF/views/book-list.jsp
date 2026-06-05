<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib prefix="fn" uri="jakarta.tags.functions"%>

<html>
<body>

	<h2>Library Books</h2>

	<a href="showForm">Add Book</a>

	<table border="1">

		<tr>
			<th>ID</th>
			<th>Title</th>
			<th>Author</th>
			<th>Category</th>
			<th>Status</th>
			<th>Action</th>
		</tr>

		<c:forEach var="book" items="${books}">

			<tr>

				<td>${book.id}</td>
				<td>${book.title}</td>
				<td>${book.author}</td>
				<td>${book.category}</td>
				<td>${book.available}</td>

				<td><a href="delete?id=${book.id}"> Delete </a></td>

			</tr>

		</c:forEach>

	</table>

</body>
</html>