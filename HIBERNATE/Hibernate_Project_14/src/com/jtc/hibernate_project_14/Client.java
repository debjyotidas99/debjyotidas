package com.jtc.hibernate_project_14;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Client {
	public static void main(String[] args) {
		Transaction txn = null;
		try {
			SessionFactory factory = Hibernate_Util.getSessionFactory();
			Session session = factory.openSession();
			txn = session.beginTransaction();
			//Address add = new Address("Adpalli", "Gadchiroli", "Chamorshi", 442707);
			//Customer cust = new Customer("Debjyoti", 24, "IT", add);
			//session.save(cust);
			
			Customer cust = (Customer) session.load(Customer.class, 1);
			System.out.println(cust);
			txn.commit();
			session.close();
		} catch (Exception e) {
			// TODO: handle exception
			txn.rollback();
			e.printStackTrace();
		}
	}
}
