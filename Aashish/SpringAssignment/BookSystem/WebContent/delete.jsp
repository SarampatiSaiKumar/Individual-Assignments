<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <meta name="viewport" content="width=device-width, initial-scale=1">  
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"> 
<title>Insert title here</title>
</head>
<body>
<div class="container">  
  <h2>Add Delete a Book</h2> 
<form action="DeleteBookServlet" method="post">
<div class="form-group">  

<label>Book Isbn</label>
<input type ="text" class="form-control" name="isbn" required >
<br/>
</div>
<input type="submit" class="btn btn-primary" name="submit" value="delete">
<br/>
</form>
</div>
</body>
</html>