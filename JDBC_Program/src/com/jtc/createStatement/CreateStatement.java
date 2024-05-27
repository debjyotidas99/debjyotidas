package com.jtc.createStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateStatement {
	
	public static void main(String[] args) {
		Connection con = null;
		Statement stm = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://@localhost:3306/demo", "root", "Mysql@1234");
			String sql1 = "insert into student values(103, 'ball', 90315087,'Ballarpur')";
			//String sql2 = "delete from student where id = 101";
			stm = con.createStatement();
			//int exeup = stm.executeUpdate(sql2);
			int update = stm.executeUpdate(sql1);
			System.out.println(update);
			//System.out.println(exeup);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (con != null)
					con.close();
				if (stm != null)
					stm.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}
}
