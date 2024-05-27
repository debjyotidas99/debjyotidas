package com.jtc.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Client {
	public static void main(String[] args) {
		try {
			Transaction tnx = null;
			SessionFactory factory =  Hibernate_Util.getSessionFactory();
			Session session =  factory.openSession();
			tnx = session.beginTransaction();
			Customer cust = new Customer("Def","def@gmail.com",8403284,"Noida");
			session.save(cust);
			tnx.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
