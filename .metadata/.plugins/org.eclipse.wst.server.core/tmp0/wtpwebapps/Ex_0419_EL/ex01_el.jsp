<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	/*
		EL(Expression Language) : JSP에서 사용하는 표현식을 조금 더 간결하게 사용하기 위한 표현식
		사용법 : ${변수명}
	`	(1) page Scope : 저장된 데이터를 현재 페이지에서만 공유하고 사용한다.
		자바로 따지면 private랑 비슷하지만 너무 폐쇄적이라 잘 안씀
		
		(2) request Scope(가장 많이 사용하는 객체) : 지역개념으로 페이지가 닫히면 종료
		 - 같은 request라면 두 개의 페이지가 같은 요청을 공유할 수 있다.
		 - 따라서 request는 객체를 하나 또는 두개의 페이지 내에서 공유할 수 있다.
		 
		 (3) session Scope : 전역의 개념
		  - 톰캣이 실행될 때 자동으로 만들어지는 영역
		  - session영역은 하나의 웹 브라우저 당  1개의 session객체가 생성된다.
		  - 즉, 같은 웹 브라우저 내에서 요청되는 페이지들은 같은 객체를 공유하게 된다.
		  
		  (4) application Scope : 최소한 내가 만든 프로젝트 내의 모든 jsp에서 값을 공유하는게 가능
		   - application 객체는 하나의 웹 어플리케이션당 1개의 객체가 생성된다.
		   - 즉, 같은 웹 어플리케이션에 요청되는 페이지들은 같은 객체를 공유한다.
	*/
	
	String msg = "안녕";
		  
	pageContext.setAttribute("key1", "페이지영역에 저장됨");	  
    
	request.setAttribute("key1", msg);	 
	
	session.setAttribute("key1", "세션에 저장됨");
%>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		EL표현식(파라미터) : ${param.name}<br>
		스크립트릿으로 출력하기 : <%=msg %><br>
		EL표현식(requestScope 데이터) : ${requestScope.key1 }<br>
		EL표현식(생략) : ${key1 }<br>
		
		<!-- 키값이 겹치게 된다면(출력되는 순위)
		1. pageScope
		2. requestScope
		3. sessionScope
		4. applicationScope -->
	</body>
</html>