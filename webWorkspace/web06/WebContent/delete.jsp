<%@page import="com.bit.emp.Emp02Delete"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<table width="1024" align="center">
		<tr>
			<td>
				<img alt="" src="img/logo.png">
			</td>
		</tr>
		<tr>
			<td align="center">
				<a href="#">[HOME]</a>
				<a href="./list.jsp">[EMP]</a>
				<a href="#">[DEPT]</a>
				<a href="#">[LOGIN]</a>
			</td>
		</tr>
		<tr>
			<td>
				<!-- content start -->
					<!-- POST -->
					<%
					if("POST".equals(request.getMethod())){
						int sabun=Integer.parseInt(request.getParameter("sabun"));
						Emp02Delete emp = new Emp02Delete();
						emp.delete(sabun);
						response.sendRedirect("list.jsp");
						return;
					}
					%>
					<!-- GET -->
					<table align="center" width="400">
						<tr align="center">
							<td><%=request.getParameter("idx") %>번 글을 삭제 하시겠습니까?</td>
						</tr>
						<tr align="center">
							<td>
								<form method="post">
									<input type="hidden" name="sabun" value="<%=request.getParameter("idx") %>">
									<input type="submit" value="삭 제">
								</form>
							</td>
						</tr>
					</table>
				<!-- content end -->
				
			</td>
		</tr>
		<tr>
			<td align="center">
			경기도 테슬라 지사<br>
			경기도<br>
			대표:이승우<br>
			</td>
		</tr>
	</table>
</body>
</html>