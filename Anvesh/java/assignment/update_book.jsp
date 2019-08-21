
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


String a = request.getParameter("bookid");
String title = request.getParameter("title");
String author = request.getParameter("author");
String price = request.getParameter("price");

int bookid = Integer.parseInt(a.trim());

String sql="update book set Title ='"+title+"' , Author='"+author+"' , Price="+price+" where book_Id="+bookid;
int x=stmt.executeUpdate(sql);
if(x>0)
	out.println("Record updated successfully");
else
	out.println("bookid "+bookid+" doesnot exists" );

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
