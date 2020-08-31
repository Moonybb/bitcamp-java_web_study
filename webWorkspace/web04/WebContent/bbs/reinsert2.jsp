<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
// Method -> get 방식의 한글처리
// 서버의 엔코딩을 바꿔준다.
// server -> server.xml 설정.
// Method -> port 방식의 한글처리
// 매 파라미터 파싱전 엔코딩

	request.setCharacterEncoding("EUC-KR");
	int ref=Integer.parseInt(request.getParameter("ref"));
	int no=Integer.parseInt(request.getParameter("no"));
	int lev=Integer.parseInt(request.getParameter("lev"));
	String sql1="update bbs01 set no=no+1 where ref="+ref;
	
	if(lev==0){
		no=0;
	}else {
		sql1+=" and no>="+no;
	}
	lev+=1;
	String sub=request.getParameter("sub");
	String id=request.getParameter("id");
	String cntnt=request.getParameter("cntnt");
	if(sub.isEmpty())sub="제목없음";
	sub = sub.replace("<","&lt;");
	sub = sub.replace(">","&gt;");
	//부등호 인식을 문자코드로 바꿔줌.
	
	
	sub = sub.replace("--","­­");
	//sub = sub.replace(" ","&nbsp;");
	sub = sub.replace("'","＇");
	
	String sql2="insert into bbs01 (num,sub,id,nalja,cntnt,ref,no,lev) values (";
	sql2+="bbs01_seq.nextval,'"+sub+"','"+id+"',sysdate,'"+cntnt+"',"+ref+","+no+","+lev+")";
	System.out.println(sql2);
	
	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="scott";
	String password="tiger";
	
	Class.forName(driver);
	
	Connection conn=null;
	Statement stmt= null;
	
	try{
		conn=DriverManager.getConnection(url,user,password);
		stmt=conn.createStatement();
		stmt.executeUpdate(sql1);
		stmt = conn.createStatement();
		stmt.executeUpdate(sql2);
	}finally{
		
		if(stmt!=null)stmt.close();
		if(conn!=null)conn.close();
	}
	response.sendRedirect("list.jsp");
	
%>
</body>
</html>