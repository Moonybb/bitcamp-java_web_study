<%@page import="com.bit.dept.model.entity.DeptVo"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>리스트 페이지</h2>
   <table>
      <tr>
         <th>deptno</th>
         <th>dname</th>
         <th>loc</th>
      </tr>
      <%
         ArrayList<DeptVo> list = null;
         list = (ArrayList<DeptVo>)request.getAttribute("alist");
         for(DeptVo bean:list){
            
      %>
      
      <tr>
         <td><a href="detail.action?deptno=<%=bean.getDeptno() %>"><%=bean.getDeptno() %></a></td>
         <td><a href="detail.action?deptno=<%=bean.getDeptno() %>"><%=bean.getDname() %></a></td>
         <td><a href="detail.action?deptno=<%=bean.getDeptno() %>"><%=bean.getLoc() %></a></td>
      </tr>
      
      <%} %>
   </table>
   <a href="add.action">[입 력]</a>
</body>
</html>