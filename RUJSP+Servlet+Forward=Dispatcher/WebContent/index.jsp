<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- Throw error page --%>
<%@ page errorPage="Error.jsp" %>



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%--
GET - Showing received data in url
POST- Do not showing any data in url 
--%>

<form action="startServlet" method="post">
	Login: <input type="text" name="login"/>
	Password: <input type="password" name="password">
	<input type="submit" name="enter" value="Login In">
	<input type="submit" name="register" value="Registration">
</form>


</body>
</html>