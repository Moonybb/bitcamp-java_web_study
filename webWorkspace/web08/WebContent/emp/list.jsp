<%@page import="com.bit.emp.EmpDto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.bit.emp.EmpCRUD"%>
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
				<img alt="" src="../img/logo.png">
			</td>
		</tr>
		<tr>
			<td align="center" bgcolor="#cccccc">
				<a href="../index.jsp">[HOME]</a>
				<a href="list.jsp">[E M P]</a>
				<a href="../dept/list.jsp">[DEPT]</a>
				<a href="../login/form.jsp">[LOGIN]</a>
			</td>
		</tr>
		<tr>
			<td>
				<!-- content start -->
				<center>
				<h1>����Ʈ ������</h1>
				<table width="800">
					<tr>
						<th>���</th>
						<th>�̸�</th>
						<th>��¥</th>
						<th>�ݾ�</th>
					</tr>
					<%
					ArrayList<EmpDto> list= EmpCRUD.list();
					
					for(int i=0;i<list.size();i++){
						EmpDto bean = list.get(i);
					%>
					<tr>
		               <td><a href="detail.jsp?sabun=<%=bean.getSabun()%>"><%=bean.getSabun() %></a></td>
		               <td><a href="detail.jsp?sabun=<%=bean.getSabun()%>"><%=bean.getName() %></a></td>
		               <td><a href="detail.jsp?sabun=<%=bean.getSabun()%>"><%=bean.getNalja() %></a></td>
		               <td><a href="detail.jsp?sabun=<%=bean.getSabun()%>"><%=bean.getPay() %></a></td>
					</tr>
					<%
					}
					%>
					<tr>
						<td colspan="2">
							<a href="add.jsp">[�Է��ϱ�]</a>
						</td>
					</tr>
				</table>
				</center>
				<!-- content end -->
			</td>
		</tr>
		<tr>
			<td align="center" bgcolor="#cccccc">
			<br>
			��⵵ �׽��� ����<br>
			��⵵<br>
			��ǥ:�̽¿�<br></td>
		</tr>
	
	</table>
</body>
</html>