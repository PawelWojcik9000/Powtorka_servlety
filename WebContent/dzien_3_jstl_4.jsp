<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@	taglib	uri="http://java.sun.com/jsp/jstl/core"	prefix="c"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:choose>
		<c:when test="${param.minimalAge >= 18}">Dowzolone od lat 18</c:when>
		<c:when test="${param.minimalAge < 18}">Dowzolone ponizej lat 18</c:when>
		<c:otherwise>Brak parametru</c:otherwise>
	</c:choose>
</body>
</html>