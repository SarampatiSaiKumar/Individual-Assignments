
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import ="java.sql.*" %>
    <%@ page import ="javax.sql.*" %>
    <%@ page import ="java.io.*" %>
    <%@ page import ="javax.servlet.*" %>
    <%@ page import ="javax.servlet.http.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Book</title>
</head>
<body>
<%
try{
PrintWriter out1= response.getWriter();

Class.forName("org.mariadb.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/java?user=root&password=password");
Statement stmt = con.createStatement();

ResultSet rs = stmt.executeQuery("SELECT * FROM book;");
String a = request.getParameter("id");
String title = request.getParameter("name");
String author = request.getParameter("author");
String price = request.getParameter("price");
int bookid = Integer.parseInt(a.trim());

String sql="insert into book values("+bookid+",'"+title+"','"+author+"',"+price+")";
int x=stmt.executeUpdate(sql);
if(x>0)
	out.println("Record added successfully");
else
	out.println("bookid "+bookid+" already exists" );

RequestDispatcher rd= request.getRequestDispatcher("/Index.html");
rd.include(request,response);

}
catch(Exception e)
{
	e.printStackTrace();
}
%>
</body>
</html>
