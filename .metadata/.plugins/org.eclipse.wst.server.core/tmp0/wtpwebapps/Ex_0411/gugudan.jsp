<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<table border="1">
			<% for(int i = 2; i < 10; i++){%>
				<tr>
				<% for(int j = 1; j < 10; j++){%>
						<%-- <td><%= i + " x " + j + " = " + i*j %></td> --%>
						<td><% String str = String.format("%d x %d = %d",i,j,i*j); %>
							<%= str %>
						</td>
					<%}%>
					
				</tr>
				<%}%>
				
			
		</table>
	</body>
</html>