package com.bit.jdoc;

import java.sql.SQLException;
import java.util.Properties;

import oracle.jdbc.OracleDriver;

public class Ex01 {

	public static void main(String[] args) {
		// dept (insert)
		//mysql protocol//[hosts][/database][?properties]
		//
		
		String url = "jdbc:oracle:thin:scott/tiger@127.0.0.1:1521:xe";//드라이버가 하는 역할
		String sql = "insert into dept values (50,'관리부','서울')";
//		String sql = "Update dept set dname='영업부' where deptno='50'";
//		String sql = "delete from dept where deptno=50";
		oracle.jdbc.driver.OracleDriver driver = null;
		driver = new oracle.jdbc.driver.OracleDriver();
		java.util.Properties prop = null;
		java.sql.Connection conn = null;
		java.sql.Statement statement=null;
		prop = new Properties();
		prop.setProperty("user", "scott");
		prop.setProperty("password", "tiger");
		try {
			conn = java.sql.DriverManager.getConnection(url);
			statement=conn.createStatement();
			int result = statement.executeUpdate(sql);
			System.out.println("성공"+result);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(statement!=null)statement.close();
				if(conn!=null)conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
