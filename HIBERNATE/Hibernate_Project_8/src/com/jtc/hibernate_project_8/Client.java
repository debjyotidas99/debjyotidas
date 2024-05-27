package com.jtc.hibernate_project_8;

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
			
			/*Address address = new Address("Main Road", "Kirana Store", "Gadchiroli", 442707);
			session.save(address);
			Employee emp = new Employee("Ram", "IT", 25, 60000);
			session.save(emp);
			emp.setAddress(address);*/
			
			/*Employee emp = (Employee)session.load(Employee.class, 46);
			Address ad= (Address)session.load(Address.class, 45);
			emp.setAddress(ad);*/
			
			/*Address add = new Address("Main Road", "Maa kali mandir", "Chamorchi", 442019);
			session.save(add);
			Employee emp =(Employee) session.load(Employee.class, 42);
			emp.setAddress(add);*/
			
			/*Employee emp = (Employee) session.load(Employee.class, 3);
			Address add = emp.getAddress();
			System.out.println(add);*/
			
			/*Employee emp = (Employee)session.load(Employee.class, 46);
			session.delete(emp);*/
			
			Address add = (Address)session.load(Address.class, 1);
			Employee em = add.getEmployee();
			System.out.println(em);
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
