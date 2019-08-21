
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

int bookid = Integer.parseInt(a.trim());
int c=0;
String sql="select * from book where book_Id="+bookid;
out1.println("Book_Id	Title	Author	Price");
out1.println("<br>");
System.out.println(sql);
ResultSet rs = stmt.executeQuery(sql);
while(rs.next()) {
	c++;
	out1.print(rs.getString(1)+"	");
	out1.print(rs.getString(2)+"	");
	out1.print(rs.getString(3)+"	");
	out1.print(rs.getString(4)+"	");
}
if(c==0) 
	out1.println("please check the bookid "+bookid);
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
