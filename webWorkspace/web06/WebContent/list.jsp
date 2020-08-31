<%@page import="com.bit.emp.dto.Emp02Bean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.bit.emp.Emp02list"%>
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
				<a href="./index.jsp">[HOME]</a>
				<a href="./list.jsp">[EMP]</a>
				<a href="#">[DEPT]</a>
				<a href="#">[LOGIN]</a>
			</td>
		</tr>
		<tr>
			<td>
				<!-- content start -->
				<h1 align="center">목 록</h1>
				<table width="800" align="center">
					<tr>
						<th width="80">사번</th>
						<th width="150">이름</th>
						<th width="120">날짜</th>
						<th width="120">금액</th>
					</tr>
					<% 
					Emp02list emp=new Emp02list();
					ArrayList<Emp02Bean> list = emp.list();
					for(int i=0;i<list.size();i++){
						Emp02Bean bean = list.get(i);
					%>
					<tr align="center">
						<td><a href="detail.jsp?idx=<%=bean.getSabun() %>"><%=bean.getSabun() %></a></td>
						<td><a href="detail.jsp?idx=<%=bean.getSabun() %>"><%=bean.getName() %></a></td>
						<td><a href="detail.jsp?idx=<%=bean.getSabun() %>"><%=bean.getNalja() %></a></td>
						<td><a href="detail.jsp?idx=<%=bean.getSabun() %>"><%=bean.getPay() %></a></td>
					</tr>
					<% 
					}
					%>
				</table>
				<a href="add.jsp">[입 력]</a>
				<!-- content end -->
				
			</td>
		</tr>
		<tr>
			<td align="center">
			<br>
			경기도 테슬라 지사<br>
			경기도<br>
			대표:이승우<br>
			</td>
		</tr>
	</table>
</body>
</html>