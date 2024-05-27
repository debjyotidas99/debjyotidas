package com.jtc.hibernate_2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Client {
	public static void main(String[] args) {
		Transaction tnx = null;
		try {
			SessionFactory factory =  Hibernate_Util.getSessionFactory();
			Session session =  factory.openSession();
			tnx = session.beginTransaction();
			Students_Info std = new Students_Info("Ramesh", "ram@gmail.com", 946231887, "J&K");
			session.save(std);
			tnx.commit();
			session.close(); 
		} catch (Exception e) {
			// TODO: handle exception
			tnx.rollback();
			e.printStackTrace();
		}
	}
}
