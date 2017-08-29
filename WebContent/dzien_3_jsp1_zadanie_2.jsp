<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@	page	import="java.util.Date"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<% Date date1 = new Date(); %>
<%! Date date2 = new Date(); %>
<%= date1 %>
<br>
<%= date2 %>
</body>
</html>