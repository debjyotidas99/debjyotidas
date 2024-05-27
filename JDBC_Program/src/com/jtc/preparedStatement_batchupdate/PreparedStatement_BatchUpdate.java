package com.jtc.preparedStatement_batchupdate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStatement_BatchUpdate {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ps =null;
		Object object[][] = {{107, "Apple", 934532, "America"},{108, "Ball", 46834236,"Ballarpur"},
				{109, "Cat", 80247893, "California"}, {110, "Dog", 68795198, "Darjeeling"}};
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","sys as sysdba", "Myoracle@1234");
			String sql = "insert into student values(?,?,?,?)";
			ps = con.prepareStatement(sql);
			for(Object [] obj : object) {
				ps.setInt(1, (int)obj[0]);
				ps.setString(2, (String)obj[1]);
				ps.setInt(3, (int)obj[2]);
				ps.setString(4, (String)obj[3]);
				ps.addBatch();
			}
			int[] i = ps.executeBatch();
			for(int ii :i) {
				System.out.println(ii);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(con != null)
					con.close();
				if(ps != null)
					ps.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
