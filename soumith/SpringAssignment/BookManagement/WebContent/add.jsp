<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Form</title>
</head>
<body>
<form action="BookServlet" method="post">
book id: <input type="text" name="bookid"><br></br>
 title: <input type="text" name="title"><br></br>
 author: <input type="text" name="author"><br></br>
 price: <input type="text" name="price"><br></br>
<input type="hidden" name="s" value="add">
  <input type="submit"><br>
</form>
</body>
</html>