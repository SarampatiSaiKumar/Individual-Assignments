
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
out1.println("<table border='1'>");
out1.println("<tr>");
out1.println("<th>ID</th>");
out1.println("<th>Title</th>");
out1.println("<th>Author</th>");
out1.println("<th>Price</th>");
out1.println("</tr>");
while (rs.next()) {
       int id = rs.getInt("book_Id");
       String title = rs.getString("title");
       String author = rs.getString("Author");
       String price = rs.getString("Price");
       out1.println("<tr>");
       out1.println("<td>"+id+"</td>");
       out1.println("<td>"+title+"</td>");
       out1.println("<td>"+author+"</td>");
       out1.println("<td>"+price+"</td>");
       out1.println("</tr>");
    }
out1.println("</table>");
out1.println("<br>");
out1.println("<br>");
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
