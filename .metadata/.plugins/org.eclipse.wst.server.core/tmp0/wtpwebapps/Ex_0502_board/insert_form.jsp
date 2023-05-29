<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<style type="text/css">
			table{border-collapse: collapse;}
		</style>
		<script type="text/javascript">
			function send_check(){
				var f = document.f; //f라는 name을 가진 form태그의 정보
				
				//유효성 검사
				if(f.subject.value == ''){
					alert("제목을 입력하세요");
					f.subject.focus();
					return;
				}
				
				if(f.name.value == ''){
					alert("작성자를 입력하세요");
					f.name.focus();
					return;
				}
				
				if(f.content.value.trim() == ''){
					alert("한 글자 이상 작성하세요");
					f.content.focus();
					return;
				}
				
				if(f.pwd.value == ''){
					alert("비밀번호를 입력하세요");
					f.pwd.focus();
					return;
				}
				
				f.submit();
			}
		</script>
	</head>
	<body>
		<form name="f" method="get" action="insert.do">
			<table border="1" align="center">
				<caption>:::새 글 쓰기:::</caption>
				<tr>
					<th>제목</th>
					<td><input name="subject" style="width: 364px;"></td>
				</tr>
				<tr>
					<th>작성자</th>
					<td><input name="name" style="width: 364px;"></td>
				</tr>
				<tr>
					<th>내용</th>
					<td>
						<!-- rows : 세로로 보여질 공간
							 cols : 가로로 보여질 공간 -->
						<textarea name="content" rows="10" cols="50" style="resize: none;"></textarea>
					</td>
				</tr>
				<tr>
					<th>비밀번호</th>
					<td><input name="pwd" type="password"></td>
				</tr>
				<tr>
					<td colspan="2" align="right">
						<img src="img/btn_reg.gif" onclick="send_check();" style="cursor: pointer;">
						<img src="img/btn_back.gif" onclick="location.href='board_list.do'" style="cursor: pointer;">
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>