package com.jtc.oracle_procedure;

import java.sql.Connection;
import java.sql.DriverManager;

public class Oracle_Procedure {
	public static void main(String[] args) {
		Connection con = null;
		java.sql.CallableStatement cs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "sys as sysdba", "Myoracle@1234");
			 String sql = "{call studentInfo(?,?,?,?)}";
			//String delete = "delete from student where id = ?";
			//cs = con.prepareCall(delete);
			 cs = con.prepareCall(sql);
			
			 cs.setInt("id", 116); cs.setString("name", "Joker"); cs.setInt("phone",
			 81203456); cs.setString("city", "Jharkhand");
			 
			//cs.setInt(1, 116);

			int a = cs.executeUpdate();
			System.out.println(a);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
				if (cs != null)
					cs.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}

/*
 * create or replace procedure insertStudentInfo(id in int,nm in varchar,eml varchar,phn long,fee float,dob
date)
as
begin
insert into jtcstudents values(id,nm,eml,phn,fee,dob);
end;
/
*/
