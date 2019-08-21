<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="beanbook" class="com.bean.book.Beanbook"/>
<jsp:setProperty name="beanbook" property="*"/>
<%out.println(beanbook.Ex()); %>

</body>
</html>