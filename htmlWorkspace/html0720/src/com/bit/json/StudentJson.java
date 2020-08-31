package com.bit.json;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.util.MyOracle;

public class StudentJson extends HttpServlet{
   @Override
//   protected void doGet(HttpServletRequest req, HttpServletResponse resp)
   protected void doGet(HttpServletRequest req, HttpServletResponse resp)
         throws ServletException, IOException {
      
      resp.setContentType("application/json;charset=utf-8");
      PrintWriter out = resp.getWriter();
      out.println("{\"students\":[");
      String sql="select * from student01 order by num desc";
      Connection conn=null;
      Statement stmt=null;
      
      ResultSet rs = null;
      try {
         conn=MyOracle.getConnection();
         stmt = conn.createStatement();
         rs = stmt.executeQuery(sql);
         boolean begin=true;
         while(rs.next()){
            if(begin){
               out.print("{");
               begin=false;
            }else{
               out.print(",{");
            }
            out.print("\"num\":"+rs.getInt("num")+",");
            out.print("\"name\":\""+rs.getString("name")+"\",");
            out.print("\"kor\":"+rs.getInt("korean")+",");
            out.print("\"eng\":"+rs.getInt("english")+",");
            out.println("\"math\":"+rs.getInt("math")+"}");
         }
      } catch (SQLException e) {
         e.printStackTrace();
      } finally{
         try {
            if(rs!=null)rs.close();
            if(stmt!=null)stmt.close();
            if(conn!=null)conn.close();
         } catch (SQLException e) {
            e.printStackTrace();
         }
      }
      out.println("]}");
   }
}