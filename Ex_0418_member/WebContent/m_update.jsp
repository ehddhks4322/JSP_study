<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	int idx = Integer.parseInt(request.getParameter("idx"));
	String name = request.getParameter("name");
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String email = request.getParameter("email");
%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<script type="text/javascript">
			function update(f){
				f.action = "m_modi.jsp";
				f.submit();
			}
		</script>
	</head>
	<body>
		<form>
			<input type="hidden" name="idx" value="<%=idx %>">
			<table border="1">
				<tr>
					<th>이름</th>
					<td><input name="name" value="<%=name %>"></td>
				</tr>
				<tr>
					<th>아이디</th>
					<td><input name="id" value="<%=id %>"></td>
				</tr>
				<tr>
					<th>비밀번호</th>
					<td><input name="pw" value="<%=pw %>"></td>
				</tr>
				<tr>
					<th>이메일</th>
					<td><input name="email" value="<%=email %>"></td>
				</tr>
				<tr>
					<td colspan="2" align="center">
						<input type="button" value="수정" onclick="update(this.form)">
						<input type="button" value="취소" onclick="location.href='member.jsp'">
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>