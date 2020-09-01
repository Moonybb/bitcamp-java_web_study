package com.bit.dept.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.bit.dept.model.entity.DeptVo;

public class DeptDao {
	Connection conn;
	
	public DeptDao() throws SQLException {
		String url="jdbc:mysql://localhost:3306/xe?characterEncoding=UTF-8&serverTimezone=UTC&useSSL=false";
		String user="root";
		String password="mysql";
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn=DriverManager.getConnection(url, user, password);
				
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
	}
	
	public ArrayList<DeptVo> selectAll(){
		ArrayList<DeptVo> list=new ArrayList<>();
		String sql="select * from dept";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next())
				list.add(new DeptVo(
						rs.getInt("deptno"),rs.getString("dname"),rs.getString("loc")
						));
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			try {
				if(conn!=null)conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	public void insertOne(String dname, String loc) {
		String sql="insert into dept (dname,loc) values (?,?)";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dname);
			pstmt.setString(2, loc);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			try {
				if(conn!=null)conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public DeptVo selectOne(int deptno) throws SQLException {
		DeptVo bean = new DeptVo();
		String sql = "select * from dept where deptno=?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, deptno);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				bean.setDeptno(rs.getInt("deptno"));
				bean.setDname(rs.getString("dname"));
				bean.setLoc(rs.getString("loc"));
			}
		}finally {
			if(conn!=null)conn.close();
		}
		return bean;
	}
	
	public void updateOne(int deptno, String dname, String loc) throws SQLException {
		String sql = "update dept set dname=?, loc=? where deptno=?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dname);
			pstmt.setString(2, loc);
			pstmt.setInt(3, deptno);
			pstmt.executeUpdate();
		}finally {
			if(conn!=null)conn.close();
		}
	}
	
}



