<%@page import="dao.MemberDAO"%>
<%@page import="vo.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	String name = request.getParameter("name");
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String email = request.getParameter("email");
	
	MemberVO vo = new MemberVO();
	vo.setName(name);
	vo.setId(id);
	vo.setPw(pw);
	vo.setEmail(email);
	
	int res = MemberDAO.getInstance().insert(vo);
	
	if(res > 0){
		response.sendRedirect("member.jsp");
	}
%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		
	</body>
</html>