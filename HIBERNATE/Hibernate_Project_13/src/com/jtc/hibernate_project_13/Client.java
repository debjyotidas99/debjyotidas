package com.jtc.hibernate_project_13;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Client {
	public static void main(String[] args) {
		Transaction txn =null;
		try {
			SessionFactory factory = Hibernate_Util.getSessionFactory();
			Session session = factory.openSession();
			txn = session.beginTransaction();
			Worker w = new Worker("Raju", 28, "Kunchuri");
			//Worker w = (Worker) session.load(Worker.class, 70);
			//w.setName("Jasmin"); 
			session.save(w);
			txn.commit();
			session.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
