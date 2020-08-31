<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="bean" class="test.Target" scope="request"></jsp:useBean>
	<h1>리다이렉트<%System.out.println(bean); %></h1>
	<%
		response.sendRedirect("result/ex03.jsp?msg=abcd");//클라이언트가 하는거. 서버에서 메서드를 호출하면 메타태그를 자동으로 적어 클라이언트가 행동하게함.
	%>
</body>
</html>