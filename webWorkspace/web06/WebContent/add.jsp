
<%@page import="com.bit.emp.Emp02Detail"%>
<%@page import="com.bit.emp.Emp02insert"%>
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
				<img alt="" src="img/logo.png">
			</td>
		</tr>
		<tr>
			<td align="center">
				<a href="#">[HOME]</a>
				<a href="./list.jsp">[EMP]</a>
				<a href="#">[DEPT]</a>
				<a href="#">[LOGIN]</a>
			</td>
		</tr>
		<tr>
			<td>
				<!-- content start -->
<%
	if("POST".equals(request.getMethod())){
		request.setCharacterEncoding("EUC-KR");
		int sabun=Integer.parseInt(request.getParameter("sabun"));
		String name=request.getParameter("name");
		int pay=Integer.parseInt(request.getParameter("pay"));
		
		Emp02insert emp = new Emp02insert();
		emp.empInsert(sabun, name, pay);
		response.sendRedirect("list.jsp");
		return;
	}
%>				

					<h1>입력 페이지</h1>
					<form method="post">
						<table width="800">
							<tr>
								<td width="400">사번</td>
								<td><input type="text" name="sabun"></td>
							</tr>
							<tr>
								<td>이름</td>
								<td><input type="text" name="name"></td>
							</tr>
							<tr>
								<td>금액</td>
								<td><input type="text" name="pay"></td>
							</tr>
							<tr align="center">
								<td colspan="2">
									<input type="submit" value="입 력">
									<input type="reset" value="취 소">
								</td>
							</tr>
						</table>
					</form>
				<!-- content end -->
				
			</td>
		</tr>
		<tr>
			<td align="center">
			경기도 테슬라 지사<br>
			경기도<br>
			대표:이승우<br>
			</td>
		</tr>
	</table>
</body>
</html>