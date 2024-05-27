package com.jtc.hibernateAnnotation;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Client {
	public static void main(String[] args) throws Exception{
		try {
			Transaction tnx = null;
			SessionFactory factory =  HibernateUtil.getSessionFactory();
			Session session =  factory.openSession();
			tnx = session.beginTransaction();
			Customer cust = new Customer("Def","def@gmail.com",6046764,"Agra");
			session.save(cust);
			tnx.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
