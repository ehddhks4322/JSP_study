<%@page import="vo.MemberVO"%>
<%@page import="dao.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<%
	int idx = Integer.parseInt(request.getParameter("idx"));
	String name = request.getParameter("name");
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String email = request.getParameter("email");
	
	MemberVO vo = new MemberVO();
	vo.setIdx(idx);
	vo.setName(name);
	vo.setId(id);
	vo.setPw(pw);
	vo.setEmail(email);
	
	int res = MemberDAO.getInstance().update(vo);
	
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