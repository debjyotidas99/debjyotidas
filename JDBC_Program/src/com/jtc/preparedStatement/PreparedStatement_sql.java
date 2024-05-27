package com.jtc.preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PreparedStatement_sql {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			/*int id = Integer.parseInt(args[0]);
			String name = args[1];
			int phone = Integer.parseInt(args[2]);
			String city = args[3];*/

Class.forName("com.mysql.cj.jdbc.Driver");
con = DriverManager.getConnection("jdbc:mysql://@localhost:3306/demo",
	"root", "Mysql@1234");
			// String sql = "insert into student values(?,?,?,?)";
			// ps = con.prepareStatement(sql);

			String sql1 = "select * from student";
			ps = con.prepareStatement(sql1);
			rs = ps.executeQuery();
			
while(rs.next()) {
	int ids = rs.getInt("id");
	String names = rs.getString("name");
	int phones = rs.getInt("phone");
	String cities = rs.getString("city");
	System.out.println(ids+"\t"+names+"\t"+phones+"\t"+cities);
}

			/*ps.setInt(1, id);
			ps.setString(2, name);
			ps.setInt(3, phone);
			ps.setString(4, city);

			int i = ps.executeUpdate();
			System.out.println(i);*/
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
				if (ps != null)
					ps.close();
				if(rs != null)
					rs.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}