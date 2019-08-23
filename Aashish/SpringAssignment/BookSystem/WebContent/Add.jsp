<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    import="javax.servlet.RequestDispatcher" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <meta charset="utf-8">  
  <meta name="viewport" content="width=device-width, initial-scale=1">  
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"> 
<title>Insert title here</title>
</head>
<body>
<div class="container">  
  <h2>Add Book Details</h2> 

<form action="AddBookServlet" method="post">
<div class="form-group">  
<label>Book Title</label>
<input type="text" class="form-control" name="title" required>
<br/>
</div>
<div class="form-group">  
<label>Book Author</label>
<input type="text" class="form-control" name="author" required>
<br/>
</div>
<div class="form-group"> 
<label>Book Price</label>
<input type="text"  class="form-control"  name="price" required>
<br/>
</div>
<input type="submit" class="btn btn-primary" name="button_clicked" value="Insert">
</form>
</div>



</body>
</html>