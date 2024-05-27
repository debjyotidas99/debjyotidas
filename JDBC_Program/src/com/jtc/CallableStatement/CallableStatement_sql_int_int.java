package com.jtc.CallableStatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CallableStatement_sql_int_int {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		ResultSet rs = null;
		Connection con = null;
		CallableStatement cs = null;
		try {
			
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "sys as sysdba", "Myoracle@1234");
			String select = "select * from student";
			cs = con.prepareCall(select, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			rs = cs.executeQuery();
			int id = 115;
			String city = "Italy";
			while (rs.next()) {
				if (rs.getInt("id") == id) {
					rs.updateString("city", city);
					rs.updateRow();
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null)
				rs.close();
			if (con != null)
				con.close();
			if (cs != null)
				cs.close();
		}
	}
}
