package com.jtc.hibernate_project_9;

//import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Client {
	public static void main(String[] args) {
		Transaction tnx = null;
		Session session = null;
		try {
			SessionFactory factory =  Hibernate_Util.getSessionFactory();
			session = factory.openSession();
			tnx = session.beginTransaction();
			
			/*Customer cust = new Customer("Sushmita", "IT", 20, 40000);
			session.save(cust);
			
			Account acc1 = new Account(568131798, "Saving", "SBI", "Ashti");
			session.save(acc1);
			
			Account acc2 = new Account(650317894, "Fixed", "Kotak", "Punjab");
			session.save(acc2);
			
			acc1.setCustomer(cust);
			acc2.setCustomer(cust);*/
			
			/*Customer cust = (Customer)session.load(Customer.class, 1);
			Set<Account> acc =  cust.getAccount();
			for(Account ac:acc)
				System.out.println(ac);*/
			
			/*Account acc = (Account)session.load(Account.class, 1);
			Customer cust =  acc.getCustomer();
			System.out.println(cust);*/
			
			Customer cust =(Customer) session.load(Customer.class, 1);
			session.delete(cust);
			
			tnx.commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			tnx.rollback();
			e.printStackTrace();
		}finally {
			if(session!=null)
			session.close();
		}
	}
}
