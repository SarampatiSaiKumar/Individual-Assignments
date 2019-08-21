<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to Employee portal page</h1>
<hr>
<form action="displayall" method="post">
<h2>

Enter Emp id<input type="text" name="eid">
<input type="submit" name="submit" value="display">
</h2>
</form>
<form action="displayall">
<h2>
Click here to see all employee records<br>
<input type="submit" name="submit" value="Dispaly all Employees">
</h2>
</form>
<hr>
<form action="displaybyDesig" method="post">
<h2>

Enter Designation<input type="text" name="designation">
<input type="submit" name="submit" value="display">
</h2>
</form>
<hr>
<form action="displayByAge" method="post">
<h2>
Enter Designation<input type="text" name="designation">
Click Here to see all the employees in sorted order
<input type="submit" name="submit" value="display">
</h2>
</form>
<hr>
<form action="insertEmp" method="post">
<h2>
Enter Id<input type="text" name="eid">
Enter Name<input type="text" name="name">
Enter Age<input type="text" name="age">
Enter Designation<input type="text" name="designation">

<input type="submit" name="submit" value="INSERT">
<input type="reset" name="reset" value="RESET">

</h2>
</form>
<hr>
<form action="updateEmp" method="post">
<h2>
Enter Id<input type="text" name="eid">
Enter Name<input type="text" name="name">
Enter Age<input type="text" name="age">
Enter Designation<input type="text" name="designation">

<input type="submit" name="submit" value="INSERT">
<input type="reset" name="reset" value="RESET">

</h2>
</form>
<hr>
<form action="deleteEmp" method="post">
<h2>
Enter Id<input type="text" name="eid">

<input type="submit" name="submit" value="remove">


</h2>
</form>
</body>
</html>