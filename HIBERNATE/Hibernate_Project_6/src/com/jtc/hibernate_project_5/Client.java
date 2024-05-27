package com.jtc.hibernate_project_5;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Client {
	public static void main(String[] args) {
		Transaction tnx = null;
		try {
			SessionFactory factory = Hibernate_Util.getSessionFactory();
			Session session = factory.openSession();
			tnx = session.beginTransaction();
			IT_Student std = new IT_Student("Debjyoti","deb@gmail.com",24,935946038);
			session.save(std);
			Current_Student cs = new Current_Student("Rohit", "Africa", 25, 9603487, 65000, "Cognizant", "rohit@gmail.com");
			session.save(cs);
			Old_Student os = new Old_Student("Ayush", "Shimultala", 14, 96427475, 10000, "7:00AM", "Som");
			session.save(os);
			Weekdays_Student wd = new Weekdays_Student("Pritam", "Delhi", 12, 87651987, 50000, "Flipkart", "pritam@.org", 2024, 88, "B.Tech");
			session.save(wd);
			Weekends_Student we = new Weekends_Student("Mukesh", "Noida", 25, 978103257, 15000, "Amazon","muk@gmail.com" , "UnMarried", "6LPA", "Mumbai");
			session.save(we);
			tnx.commit();
			session.close();
		} catch (Exception e) {
			// TODO: handle exception
			tnx.rollback();
			e.printStackTrace();
		}
		
		
		
	}
}
