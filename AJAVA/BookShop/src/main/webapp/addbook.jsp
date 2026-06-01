<%@ page import="java.util.List" %>
<%@ page import="com.app.entity.Book" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Books</title>
</head>

<body>

	<h2>Book List</h2>

	<table border="1" cellpadding="10">

		<tr>
			<th>ID</th>
			<th>Title</th>
			<th>Author</th>
			<th>Price</th>
			<th>Delete</th>
		</tr>

		<%
		List<Book> books =
			(List<Book>)request.getAttribute("books");

		for(Book b : books){
		%>

		<tr>

			<td><%= b.getId() %></td>
			<td><%= b.getTitle() %></td>
			<td><%= b.getAuthor() %></td>
			<td><%= b.getPrice() %></td>

			<td>

				<a href="deletebook?id=<%= b.getId() %>">
					Delete
				</a>

			</td>

		</tr>

		<%
		}
		%>

	</table>

</body>
</html>