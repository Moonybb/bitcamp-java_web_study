<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>JSTL(변수의 선언과 출력)</h1>
	<p>jstl & standard .jar 파일 라이블리 추가</p>
	<p>taglib에 등록해야 사용 가능</p>
	<c:out value="출력"></c:out><br/>
	<c:set var="msg" scope="page" value="${null }"></c:set>
	${pageScope.msg }</br>
	<!-- 태그 안에 들어갈 문자열은 vlaue의 값이 null일 때 대체할 문자열이 들어간다. -->
	<c:out value="${msg }">대체할 문자열1</c:out><br/>
	<c:out value="<%=null %>">대체할 문자열2</c:out><br/>
	<c:out value="출력4"/><br/>
	<c:out value='<%="출력5" %>'/><br/>
	
</body>
</html>