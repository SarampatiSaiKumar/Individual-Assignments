<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to Employee Portal page</h1>
<hr>
<form action="displayAll" method="post">
<h2>
Click here to see all emp records
<input type="submit" name="submit" value="Displayall">
</h2>
</form>
<hr>
<form action="Find" method="post">
<h2>
enter here to see an emp record
<input type="text" name="eid">
<input type="submit" name="submit" value="Find">
</h2>
</form>
<hr>
<form action="displayByDesig" method="post">
<h2>
enter Designation to see all emp record
<input type="text" name="designation">
<input type="submit" name="submit" value="Display">
</h2>
</form>

<hr>
<form action="displayByAge" method="post">
<h2>
 all emp records sorted by age
<input type="text" name="designation">
<input type="submit" name="submit" value="Display">
</h2>
</form>


<hr>
<form action="insertEmp" method="post">
<h2>
Id:<input type="text" name="eid">
Name:<input type="text" name="name">
Age:<input type="text" name="age">
Designation:<input type="text" name="designation">
<input type="submit" name="submit" value="Add">
<input type="reset" name="reset" value="Reset">
</h2>
</form>

</body>
</html>