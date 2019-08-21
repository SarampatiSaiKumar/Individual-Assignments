<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book Management</title>
</head>
<body>
<h3>Select the option</h3>
<form action="BookServlet" method="post">
<input type="radio" name="bookdetails" value="add">Add a book<br>
<input type="radio" name="bookdetails" value="view">View a book<br>
<input type="radio" name="bookdetails" value="viewall">View all books<br>
<input type="radio" name="bookdetails" value="delete">Delete a book<br>
<input type="radio" name="bookdetails" value="update">Update a book<br>
<br>
<input type="hidden" name="s" value="home">
<input type="submit">
</form>
</body>
</html>