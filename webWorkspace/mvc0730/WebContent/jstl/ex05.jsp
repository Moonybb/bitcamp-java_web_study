<%@page import="java.util.StringTokenizer"%>
<%@page import="sun.util.locale.StringTokenIterator"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>JSTL etc...</h1>
	<%
		String msg = "java,DB,web,framework,app";
		pageContext.setAttribute("msg", msg);
		
		StringTokenizer stToken = new StringTokenizer(msg,",");
		while(stToken.hasMoreTokens()){
			System.out.println(stToken.nextToken());
		}
	%>
	<ul>
		<c:forTokens items="${msg }" delims="," var="ele">
			<li>${ele }</li>
		</c:forTokens>
	</ul>
	
	<div>
		<c:import url="http://google.com"></c:import>
	</div>
	
	
</body>
</html>