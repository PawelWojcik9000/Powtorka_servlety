<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
Start = ${start }<br>
End = ${end }<br>
<%
String start = request.getAttribute("start").toString();
String end = request.getAttribute("end").toString();
int numStart = Integer.parseInt(start);
int numEnd = Integer.parseInt(end);
for(int i=numStart; i<=numEnd; i++) {
	out.println(i);
}
%>
</body>
</html>