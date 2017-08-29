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
	<c:if test="${not empty param.minimalAge}">
		<c:if test="${param.minimalAge >= 18}">Dozwolone od 18 lat</c:if>
		<c:if test="${param.minimalAge < 18}">Dozwolone ponizej 18 lat</c:if>
	</c:if>
	<c:if test="${empty param.minimalAge}">
		Brak parametru
	</c:if>
</body>
</html>