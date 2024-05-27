package com.jtc.CallableStatement;

import java.sql.Connection;
import java.sql.DriverManager;

public class CallableStatement {
	public static void main(String[] args) {
		Connection con = null;
		java.sql.CallableStatement cs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","sys as sysdba", "Myoracle@1234");
			//String sql = "insert into student values(115, 'Ice-Cream', 76031856, 'Italy')";
			//String delete = "delete from student where city='Italy'";
			String update = "update student set city = 'Indore' where id = 115";
			//cs = con.prepareCall(sql);
			//cs = con.prepareCall(delete);
			cs = con.prepareCall(update);
			int a = cs.executeUpdate();
			System.out.println(a);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(con != null)
					con.close();
				if(cs != null)
					cs.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
