<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
	    Cookie cookie = new Cookie("param","asdfasdf");
		response.addCookie(cookie);
    %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		쿠키저장완료<br>
		쿠키의 이름 : ${cookie.param.name}<br>
		쿠키의 내용 : ${cookie.param.value}<br>
	</body>
</html>