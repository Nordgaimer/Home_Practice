<%@page import="java.awt.peer.LightweightPeer"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String login = request.getParameter("login");
String pass = request.getParameter("password");
String loginIn = request.getParameter("enter");
String regist = request.getParameter("register");
%>
<p><font color="green">Login: <%=login%></font></p>
<p><font color="red">Password: <%=pass%></font></p>
<p><font color="grey">Button LogIn: <%=loginIn%></font></p>
<p><font color="grey">Button Register: <%=regist%></font></p>
</body>
</html>