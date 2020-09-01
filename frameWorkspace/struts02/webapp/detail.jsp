<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>상세페이지</h2>
	<div><span>deptno</span><span>${bean.deptno }</span></div>
	<div><span>dname</span><span>${bean.dname }</span></div>
	<div><span>loc</span><span>${bean.loc }</span></div>
	<div>
		<a href="edit.action?deptno=${bean.deptno }">수 정</a>
		<a href="detail.action?deptno=${bean.deptno }">삭 제</a>
	</div>
</body>
</html>