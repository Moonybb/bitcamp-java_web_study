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
			<h1>게시판</h1>
			<table width="90%" border="1" cellspacing="0">
				<tr>
					<td width="80">글번호</td>
					<td>제목</td>
					<td width="100">글쓴이</td>
					<td width="100">날짜</td>
				</tr>
<%
	String key=request.getParameter("key");
	String word=request.getParameter("word");
	if(key==null)key="sub";
	if(word==null)word="";
	String sql="select num,sub,id,nalja,lev from bbs01 where "+key;
	sql+=" like '%"+word+"%' order by ref desc,no asc";
	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="scott";
	String password="tiger";
	
	Class.forName(driver);
	Connection conn=null;
	Statement stmt=null;
	ResultSet rs=null;
	try{
		conn=DriverManager.getConnection(url,user,password);
		stmt=conn.createStatement();
		rs=stmt.executeQuery(sql);
		while(rs.next()){
			int gap=rs.getInt(5);
			String msg="";
			for(int i=0;i<gap;i++){
				msg+="&nbsp;&nbsp;&nbsp;";
			}
			if(gap!=0)msg+="┗";
%>			
				
				<tr>
					<td><a href="detail.jsp?idx=<%=rs.getInt(1) %>"><%=rs.getInt(1) %></a></td>
					<td><a href="detail.jsp?idx=<%=rs.getInt(1) %>"><%=msg+rs.getString(2) %></a></td>
					<td><a href="detail.jsp?idx=<%=rs.getInt(1) %>"><%=rs.getString(3) %></a></td>
					<td><a href="detail.jsp?idx=<%=rs.getInt(1) %>"><%=rs.getDate(4) %></a></td>
				</tr>
<% 
		}
	}finally{
		if(rs!=null)rs.close();
		if(stmt!=null)stmt.close();
		if(conn!=null)conn.close();
	}
%>
			</table>
			<form action="list.jsp">
				<select name="key">
					<option value="sub">제목</option>
					<option value="id">글쓴이</option>
				</select>
				<input type="text" name="word">
				<input type="submit" value="검색">
			</form>
			<a href="add.jsp">[입 력]</a>
			</center>
		</td>
	</tr>
	<tr>
		<td bgcolor="gray" >&nbsp;</td>
		<td bgcolor="white" colspan="4">
		TESLA 무엇이든 게시하세요<br>
		돈 많이 법시다<br>
		법인사장:이승우<br>
		e-mail:xonic789@naver.com<br>
		</td>
		<td bgcolor="gray" >&nbsp;</td>
	</tr>
	
	</table>
</body>
</html>