<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="beanbook.jsp">
<%
 String s=request.getParameter("bookdetails");
 if(s.equals("add")){	 
 %>
 book id: <input type="text" name="bookid"><br></br>
 title: <input type="text" name="title"><br></br>
 author: <input type="text" name="author"><br></br>
 price: <input type="text" name="price"><br></br>
 <%
 }
 else if(s.equals("view")){
%>
book id: <input type="text" name="bookid"><br></br>
<%
}
else if(s.equals("delete")){
%>	 
book id: <input type="text" name="bookid"><br></br>
 <%
}
else if(s.equals("update")){
 %>
book id: <input type="text" name="bookid"><br></br>
 title: <input type="text" name="title"><br></br>
 author: <input type="text" name="author"><br></br>
 price: <input type="text" name="price"><br></br>
 <%
}
/* else{
	out.println("hi");
} */
 %> 
 <input type="hidden" name="s" value="<%=s %>">
  <input type="submit"><br>
</form>
</body>
</html>