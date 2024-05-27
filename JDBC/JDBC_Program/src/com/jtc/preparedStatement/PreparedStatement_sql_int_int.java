package com.jtc.preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PreparedStatement_sql_int_int {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
	con = DriverManager.getConnection("jdbc:mysql://@localhost:3306/demo",
		"root", "Mysql@1234");

			String sql = "select * from student";
	ps = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, 
		ResultSet.CONCUR_UPDATABLE);
			rs = ps.executeQuery();

			int id = 102;
			String city = "America";

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
			try {
				if (con != null)
					con.close();
				if (ps != null)
					ps.close();
				if (rs != null)
					rs.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
