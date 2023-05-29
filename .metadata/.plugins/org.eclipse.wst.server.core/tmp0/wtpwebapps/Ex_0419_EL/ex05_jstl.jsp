<%@page import="java.util.Date"%>
<%@page import="vo.Person"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 

<%
	List<String> array = new ArrayList<>();
	array.add("서울");
	array.add("대전");
	array.add("대구");
	
	request.setAttribute("array", array);
	
	int n = 10;
	
	request.setAttribute("n", n);
	
	Person p1 = new Person();
	p1.setName("홍길동");
	p1.setAge(30);
	
	Person p2 = new Person();
	p2.setName("박길동");
	p2.setAge(29);
	
	List<Person> list = new ArrayList<>();
	list.add(p1);
	list.add(p2);
	
	request.setAttribute("list", list);
	
	int money = 1000000;
	request.setAttribute("money", money);
	Date today = new Date();
	request.setAttribute("today", today);
	
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<!-- JSTL(Jsp Standard Tag Library)
		c(Core) : if, choose, forEach와 같은 제어문을 사용할 수 있도록 해주는 라이브러리 -->
		
		<!-- if -->
		<c:if test="${n eq 10 }">
			<%-- <c:out value="참"/> --%>
			참
		</c:if>
		
		
		<hr>
		
		<!-- if - esle if - else -->
		<!-- choose문 안에는 절대 주석을 달지 않는다.(작동이 되지 않기 떄문) -->
		<!-- 여러가지 조건을 비교할 때는 choose가 더 효율적이다. -->
		<c:choose>
			<c:when test="${param.msg eq 10 }">msg는 10이다.</c:when>
			<c:when test="${param.msg eq 11 }">msg는 11이다.</c:when>
			<c:otherwise>모두 아니다.</c:otherwise>
		</c:choose>
		
		<hr>
		
		<!-- var : 값을 담을 변수
			 begin : 시작값
			 end : 끝값
			 step : 증가값 -->
		
		<!-- for(int i = 1; i <= 5; i++){
				system.out.println("안녕"+i);
			}
		 -->
		<c:forEach var="i" begin="1" end="5" step="1">
			안녕${i}<br>
		</c:forEach>
		
		<hr>
		
		<!-- for(String s : array){
				system.out.println(s);
			}
		 -->
		<c:forEach var="s" items="${array}">
			${s}<br>
		</c:forEach>
		
		<hr>
		
		<c:forEach var="u" items="${list}">
			${u.name} / ${u.age}<br>
		</c:forEach>
		
		<hr>
		
		fmt라이브러리 관련<br>
		<fmt:formatNumber value="${money}"/><br> <!-- 숫자를 단위별로 ,를 찍어서 구분해줌 -->
		<fmt:formatDate value="${today}"/><br>
		<fmt:formatDate value="${today}" pattern="yyyy년 MM월 dd일"/><br>
		DD : 1월1일부터 오늘까지 경과된 일 수<br>
		dd : 오늘 일<br>
		
	</body>
</html>