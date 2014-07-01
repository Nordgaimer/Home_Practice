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
<%-- DECLARATION --%>
<%! int numOfPageLoad; %>

<%--SCRIPLET --%>
<%
	int a=3;
	int b=1;
	int res=a/b;
	numOfPageLoad++;
%>
<%--SHOW EXPRESSION --%>
Result a/b is: <font color="red"><%=res%></font></br>
Page has been loaded: <%=numOfPageLoad %> times.</br>
<%-- Including another JSP page --%>
<%@ include file="include_test.jsp" %>

</body>
</html>