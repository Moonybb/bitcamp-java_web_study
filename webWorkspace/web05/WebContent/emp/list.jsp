<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body bgcolor="#cccccc">
<%@ include file="../template/header.jspf" %>
<%@ include file="../template/menu.jspf" %>
	<h1>LIST PAGE</h1>
	<p align="right"><a href="add.jsp">[입력]</a></p>
	<table bgcolor="white" width=95% border="1" cellspacing="0" align="center">
		<tr>
			<th>사번</th>
			<th>이름</th>
			<th>날짜</th>
			<th>금액</th>
		</tr>
		<% 
		int tot=0;
		int p=1;
		String param=request.getParameter("page");
		if(param!=null)p=Integer.parseInt(param);
		
		int startNum=1+(p-1)*10;// ,11,21,31
		int endNum=10+(p-1)*10;// ,20,30,40
		String sql="select * from (select rownum as rn,sabun,name,nalja,pay from ";
		sql+=" (select * from emp01 order by sabun desc)) where rn between ";
		sql+=startNum+" and "+endNum;
		
		System.out.println(sql);
		
		
		Class.forName(driver);
		
		try{
			conn=DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			rs=stmt.executeQuery("select count(*) from emp01");
			if(rs.next())tot=rs.getInt(1);
			
			stmt.close();
			rs.close();
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			while(rs.next()){
		%>
		<tr>
			<td><a href="detail.jsp?idx=<%=rs.getInt("sabun") %>"><%=rs.getInt("sabun") %></a></td>
			<td><a href="detail.jsp?idx=<%=rs.getInt("sabun") %>"><%=rs.getString("name") %></a></td>
			<td><a href="detail.jsp?idx=<%=rs.getInt("sabun") %>"><%=rs.getDate("nalja") %></a></td>
			<td><a href="detail.jsp?idx=<%=rs.getInt("sabun") %>"><%=rs.getInt("pay") %></a></td>
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
	<center>
	<!--  -->
	
	<%
	//int total=151;
	//if(total%10==0)total=total/10;
	//else total=total/10+1;
	// 01~10	/10=0	1
	// 11~20	/10=1	2
	// 21~30	/10=2	3
	
	
	int lang=5;
	//select count(*) from emp01;
	//int limit=(tot-1)/10+1;
	int limit=(tot-1)/10+1;
	
	// p=1~10  -1	/10=0	+1)*10	limit=10;
	// p=11~20 -1	/10=1	+1)*10	limit=20;
	// p=21~30 -1	/10=2	+1)*10	limit=30;
	// p=31~40 -1	/10=3	+1)*10	limit=limit;
	

	int start=((p-1)/lang)*lang;
	int end=start+lang;
	if(end>limit) end=limit; // 끝까지 안가면 리밋트로 제한.
	if(p>=lang+1){
		out.print("<a href=list.jsp?page="+(start)+">[prev]</a>");
	}
	for(int i=start;i<end;i++){
	%>
		<a href="list.jsp?page=<%=i+1%>">[<%=i+1%>]</a>
	<%
	}
	if(end<limit){
	out.print("<a href=list.jsp?page="+(end+1)+">[next]</a>");
	}
	%>
	
	
	<br>	<br>	<br>	<br>
		<a href="list.jsp?page=1">[1]</a>
		<a href="list.jsp?page=2">[2]</a>
		<a href="list.jsp?page=3">[3]</a>
		<a href="list.jsp?page=4">[4]</a>
		<a href="list.jsp?page=5">[5]</a>
		
	</center>
<%@ include file="../template/focter.jspf" %>
</body>
</html>












