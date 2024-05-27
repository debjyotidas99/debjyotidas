package com.jtc.hibernate_1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Client {
	public static void main(String[] args) {
		try {
			Transaction tnx = null;
			SessionFactory factory =  Hibernate_Util.getSessionFactory();
			Session session = factory.openSession();
			tnx = session.beginTransaction();
			Customer cust = new Customer("Sushmita","sush@gmail.org",93141358,"C.G");
			session.save(cust);
			tnx.commit();
			session.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
