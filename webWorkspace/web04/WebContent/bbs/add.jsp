<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<table width="1024" align="center">
	<tr>
		<td colspan="6"><img src="/web04/img/logo.png"></td>
	</tr>
	<tr>
		<td bgcolor="#cccccc">&nbsp;</td>
		<td align="center" bgcolor="#cccccc" width="100"><a href="/web04/">[HOME]</a></td>
		<td align="center" bgcolor="#cccccc" width="100"><a href="/web04/bbs/list.jsp">[B B S]</a></td>
		<td align="center" bgcolor="#cccccc" width="100"><a href="/web04/emp/list.jsp">[E M P]</a></td>
		<td align="center" bgcolor="#cccccc" width="100"><a href="/web04/login/form.jsp">[LOGIN]</a></td>
		<td align="center" bgcolor="#cccccc">&nbsp;</td>
		
	</tr>
	<tr>
		<td colspan="6" bgcolor="white">
			<center>
			<h1>�۾���</h1>
			<form action="insert.jsp" method="post">
				<table width="600" align="center">
					<tr>
						<td width="100">����</td>
						<td><input type="text" name="sub" size="60"></td>
					</tr>
					<tr>
						<td>�۾���</td>
						<td><input type="text" name="id"  size="60"></td>
					</tr>
					<tr>
						<td></td>
						<td><textarea name="cntnt" row="6" cols="60"></textarea></td>
					</tr>
					<tr>
						<td colspan="2" align="center">
							<input type="submit" value="�۾���">
							<input type="reset" value="�� ��">
						</td>
					</tr>
				</table>
			</form>
			</center>
		</td>
	</tr>
	<tr>
		<td bgcolor="gray" >&nbsp;</td>
		<td bgcolor="white" colspan="4">
		TESLA �����̵� �Խ��ϼ���<br>
		�� ���� ���ô�<br>
		���λ���:�̽¿�<br>
		e-mail:xonic789@naver.com<br>
		</td>
		<td bgcolor="gray" >&nbsp;</td>
	</tr>
	
	</table>
</body>
</html>