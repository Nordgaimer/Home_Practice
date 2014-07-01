<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%-- Import class from Java to JSP page  --%>
<%@ page import="java.util.Date"%>

<%-- Sessions on this JSP on/off --%>
<%@ page session="true" %>

<%-- Getting info about servlet --%>
<%@ page info="" %>

<%-- Buffer autoflash on\off --%>
<%@ page autoFlush="true" %>

<%-- Throw error page --%>
<%@ page errorPage="error.jsp" %>

<%-- Giving information is this error page going to be used for another exceptions true/false--%>
<%@ page isErrorPage="error.jsp" %>

<%-- Including another JSP page --%>
<%@ include file="include_test.jsp" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%--SCRIPLET --%>
<%
	int a=2;
	int b=3;
	int res=a+b;
%>
<%--SHOW EXPRESSION --%>
<%=res%>

</body>
</html>