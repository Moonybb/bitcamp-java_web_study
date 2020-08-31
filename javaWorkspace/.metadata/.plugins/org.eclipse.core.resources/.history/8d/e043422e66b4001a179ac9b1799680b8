package com.bit.jdoc;

import java.sql.*;
import java.util.Properties;

import oracle.jdbc.driver.OracleDriver;

public class Database1 {
	
	public static void main(String[] args) {
		String sql = "select * from dept order by deptno desc";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		 
		
		java.util.Properties properties = new Properties();
		properties.setProperty("user", "scott");
		properties.setProperty("password", "tiger");
		
		//커넥션,스테이트먼트 객체
		Connection connection = null;
		Statement statement = null;
		java.sql.ResultSet resultSet = null;
		
		
//		oracle.jdbc.driver.OracleDriver driver = null;
//		driver=new OracleDriver();
		new OracleDriver();
		
		try {
			connection = DriverManager.getConnection(url,properties);
			statement=connection.createStatement();
			resultSet=statement.executeQuery(sql);
			while(resultSet.next()){
				System.out.print(resultSet.getObject(1)+"\t");
				System.out.print(resultSet.getObject(2)+"\t");
				System.out.println(resultSet.getObject(3));
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(resultSet!=null)resultSet.close();
				if(statement!=null)statement.close();
				if(connection!=null)connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
