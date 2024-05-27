package com.jtc.employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Client {
	public static void main(String[] args) {
		Transaction tnx = null;
		try {
			SessionFactory factory =  Hibernate_Util.getSessionFactory();
			 Session session = factory.openSession();
			 tnx = session.beginTransaction();
			 Employee emp = new Employee("Sumit", "sumit@gmail.com", 18, "Gadchiroli");
			 session.save(emp);
			 tnx.commit();
			 session.close();
		} catch (Exception e) {
			// TODO: handle exception
			tnx.rollback();
			e.printStackTrace();
		}
	}
}
