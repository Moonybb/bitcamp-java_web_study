<%@page import="java.util.ArrayList"%>
<%@page import="com.bit.dept.DeptDto"%>
<%@page import="com.bit.dept.DeptCRUD"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
// useBean scope
//		page(default) < request < session < application
//		������ ��	< �ϳ��� request������ ����(response�ϱ���������) < ������ �����Ǵ� �ð�.(default 30��,session�� �ϳ�) < ������� �����Ҷ�����
%>

<jsp:include page="/template/header.jsp">
<jsp:param value="../" name="path"/>
</jsp:include>
<jsp:include page="/template/menu.jsp">
<jsp:param value="../" name="path"/>
</jsp:include>
	<center>
	<h1>DEPT01 LIST</h1>
	<table width="800">
		<tr>
			<th>��ȣ</th>
			<th>���̵�</th>
			<th>�̸�</th>
			<th>����</th>
		</tr>
		<%
		DeptCRUD crud = new DeptCRUD();
		ArrayList<DeptDto> list = crud.list();
		for(DeptDto bean : list){
		%>
		<tr>
			<td><a href="detail.jsp?num=<%=bean.getNum() %>"><%=bean.getNum() %></a></td>
			<td><a href="detail.jsp?num=<%=bean.getNum() %>"><%=bean.getId() %></a></td>
			<td><a href="detail.jsp?num=<%=bean.getNum() %>"><%=bean.getName() %></a></td>
			<td><a href="detail.jsp?num=<%=bean.getNum() %>"><%=bean.getLev()%></a></td>
		</tr>
		<%
		}		
		%>
	</table>
	</center>
	<a href="add.jsp">[�� ��]</a>
<jsp:include page="./../template/footer.jsp"></jsp:include>
</body>
</html>