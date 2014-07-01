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
<%--SESSION--%>

<form action="setsession.jsp" method="post">
	Input: <input type="text" name="textinput"/>
	<input type="submit" name="send" value="next">
	
</form>


</body>
</html>