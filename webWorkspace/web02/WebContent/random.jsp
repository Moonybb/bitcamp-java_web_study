<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>랜덤값추출</h1>
	<%!
	int aa= 0;
	%>
	<%
	String a="";
	String[] name = new String[5];
	java.util.Random random = new java.util.Random();
	
		out.print(random.nextInt(10));
	
	%>
</body>
</html>