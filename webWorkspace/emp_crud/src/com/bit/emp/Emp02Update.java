package com.bit.emp;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class Emp02Update {
	
	public int update(int sabun,String name,int pay){
		String sql="{call emp02update(?,'"+name+"',"+pay+","+sabun+")}";
		Connection conn = null;
		CallableStatement cstmt = null;
		
		try {
			cstmt=Oracle.getConnection().prepareCall(sql);
			cstmt.registerOutParameter(1, oracle.jdbc.OracleTypes.INTEGER);
			cstmt.execute();
			return cstmt.getInt(1);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(cstmt!=null)cstmt.close();
				if(conn!=null)Oracle.getConnection().close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return 0;
		
	}

}
