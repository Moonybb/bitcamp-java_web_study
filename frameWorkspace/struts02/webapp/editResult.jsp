<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>정상 처리하였습니다</h2>
	<script type="text/javascript">
		function callback(){
			location.href="edit.action?deptno=${deptno}";
		}
		setTimeout(callback, 1000);
	</script>
</body>
</html>