<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="org.nordgaimer.dto.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Success</title>
</head>
<body>
You successfully logged in! 

<jsp:useBean id="user" class="org.nordgaimer.dto.User" scope="request">
</jsp:useBean>
Hello <%=user.getUserName() %>
</body>
</html>