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
	if(request.getParameter("a") != null && request.getParameter("b") != null) {
		int a = Integer.parseInt(request.getParameter("a"));
		int b = Integer.parseInt(request.getParameter("b"));
		%><ul><%
		if(a<b) {
			for(int i=a; i<=b; i++) {
				%><li><%= i %></li><%
			}
			%></ul><%
		}
		
	}
	
%>

</body>
</html>