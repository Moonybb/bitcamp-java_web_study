<%@page import="com.bit.emp.dto.Emp02Bean"%>
<%@page import="com.bit.emp.Emp02Detail"%>
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
<%
	String param=request.getParameter("idx");
	int sabun=Integer.parseInt(param);
	Emp02Detail emp = new Emp02Detail();
	Emp02Bean bean= emp.detail(sabun);
%>
				<h1>상세페이지</h1>
				<table width="800" align="center">
					<tr>
						<td>사번</td>
						<td><%=bean.getSabun() %></td>
					</tr>
					<tr>
						<td>이름</td>
						<td><%=bean.getName() %></td>
					</tr>
					<tr>
						<td>날짜</td>
						<td><%=bean.getNalja() %></td>
					</tr>
					<tr>
						<td>금액</td>
						<td><%=bean.getPay() %></td>
					</tr>
				
					<tr>
						<td colspan="2">
							<a href="edit.jsp?idx=<%=bean.getSabun() %>">[수 정]</a>
							<a href="delete.jsp?idx=<%=bean.getSabun() %>">[삭 제]</a>
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