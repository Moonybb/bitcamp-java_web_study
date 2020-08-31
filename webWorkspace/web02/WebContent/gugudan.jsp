<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<h1 align = "center">구구단 출력</h1>
</head>
<body>

<%!
public String gugudan(String a,String b){
for(int i=0;i<10;i++){
		a+="<tr>";
		for(int j=2;j<10;j++){
			if(i==0){
				b+="<td>"+j+"단"+"</td>";
				
			}else{
				a+="<td>"+j+"*"+i+"="+(j*i)+" "+"</td>";				
			}
			
		}
		a+="</tr>";
	}
	return b+a;
}
%>
<table border="1" align="center">
<% 
String a="";
String b="";
String c = gugudan(a,b);
	%>
<%=c %>

</table>
</body>
</html>