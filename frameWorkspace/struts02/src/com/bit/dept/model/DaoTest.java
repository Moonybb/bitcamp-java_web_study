package com.bit.dept.model;

import java.sql.SQLException;

public class DaoTest {
	
	public static void main(String[] args) {
		DeptDao dao = null;
		try {
			dao = new DeptDao();
			System.out.println("connection:"+dao.conn);
			System.out.println("정상 처리");
		} catch (SQLException e) {
			System.out.println("exception 발생");
			e.printStackTrace();
		}
	}
}
