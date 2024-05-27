package com.jtc.createStatement_BatchUpdate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateStatement_BatchUpdate {
	public static void main(String[] args) {
		Connection con = null;
		Statement s = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
	con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE",
		"sys as sysdba", "Myoracle@1234");
String sql1 = "insert into student values(111, 'Egg', 684218, 'Europe')";
String sql2 = "insert into student values(112, 'Fish', 3971664,'Franch')";
String sql3 = "insert into student values(113, 'Goat', 76676875, 'Georgia')";
String sql4 = "insert into student values(114, 'Hen', 98031058, 'Hungary')";
s = con.createStatement();

s.addBatch(sql1);
s.addBatch(sql2);
s.addBatch(sql3);
s.addBatch(sql4);

int[] i = s.executeBatch();
for (int ii : i) {
	System.out.println(ii);
}

} catch (Exception e) {
	e.printStackTrace();
	} finally {
			try {
				if (con != null)
					con.close();
				if (s != null)
					s.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
