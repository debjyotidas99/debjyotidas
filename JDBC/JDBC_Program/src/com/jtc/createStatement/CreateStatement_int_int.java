package com.jtc.createStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class CreateStatement_int_int {
public static void main(String[] args) {
		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;
try {
Class.forName("com.mysql.cj.jdbc.Driver");
con = DriverManager.
getConnection("jdbc:mysql://@localhost:3306/demo", "root", "Mysql@1234");
String sql = "select * from student";
stm = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
ResultSet.CONCUR_UPDATABLE);
rs = stm.executeQuery(sql);
String city = "California";
int id = 102;
while(rs.next()) {
if(rs.getInt("id") == id) {
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
				if (stm != null)
					stm.close();
				if(rs != null)
					rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
	}
}
