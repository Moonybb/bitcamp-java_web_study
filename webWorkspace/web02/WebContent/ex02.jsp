<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1 align="center"> 구구단 출력 </h1>
<table width="80%" align = "center" border="1">
<tr>
	<td>2단</td>
	<td>3단</td>
	<td>4단</td>
	<td>5단</td>
	<td>6단</td>
	<td>7단</td>
	<td>8단</td>
	<td>9단</td>
</tr>
<%
String a= "";
	for(int i=1;i<10;i++){
			a+="<tr>";
		for(int j=2;j<10;j++){
			a+="<td>"+j+"*"+i+"="+(j*i)+"</td>";
		}
		a+="</tr>";
	}
%>
<%= a%>
</table>
</body>
</html>