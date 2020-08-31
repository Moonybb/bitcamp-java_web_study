<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%@ include file="../template/header.jspf" %>
<%@ include file="../template/menu.jspf" %>
	<%
	String id=request.getParameter("id");
	String pw=request.getParameter("pw");
	
	String sql="select name from dept01 where id='"+id+"' and pw='"+pw+"'";
	String name=null;
	try{
		Class.forName(driver);
		conn=DriverManager.getConnection(url, user, password);
		stmt=conn.createStatement();
		rs=stmt.executeQuery(sql);
		if(rs.next()){
			name = rs.getString(1);
		}
	}finally{
		if(rs!=null)rs.close();
		if(stmt!=null)stmt.close();
		if(conn!=null)conn.close();
	}
	if(name!=null){
		session.setAttribute("name", name);
		response.sendRedirect("../emp/list.jsp");//로그인되면 list로 보내버림.
	}else{
		response.sendRedirect("form.jsp?err=fail");
	}
	%>
<%@ include file="../template/focter.jspf" %>

</body>
</html>