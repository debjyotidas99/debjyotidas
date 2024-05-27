package com.jtc.mysql_storedprocedure;



	import java.sql.Connection;
	import java.sql.DriverManager;

	public class Mysql_StoredProcedure {
		public static void main(String[] args) {
			Connection con = null;
			java.sql.CallableStatement cs = null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://@localhost:3306/demo", "root", "Mysql@1234");
				 //String sql = "{call studentInfo(?,?,?,?)}";
				String delete = "delete from student where id = ?";
				cs = con.prepareCall(delete);
				 //cs = con.prepareCall(sql);
				
				 //cs.setInt("id", 116); cs.setString("name", "Joker"); cs.setInt("phone",
				 //81203456); cs.setString("city", "Jharkhand");
				 
				cs.setInt(1, 116);

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

	/*DELIMITER $$
	USE `demo`$$
	CREATE DEFINER=`root`@`localhost` PROCEDURE `studentInfos`(id int, name varchar(20), phone int, city varchar(20))
	BEGIN
	insert into students values(id,name,phone,city);
	END$$

	DELIMITER ;
	;*/


