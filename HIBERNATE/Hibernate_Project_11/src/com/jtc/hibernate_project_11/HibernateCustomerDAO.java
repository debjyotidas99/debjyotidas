package com.jtc.hibernate_project_11;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class HibernateCustomerDAO implements CustomerDAO {

	@Override
	public void addCustomer(CustomerTO cto) {
		Transaction tnx = null;
		SessionFactory factory = null;
		Session session = null;
		try {
			factory = Hibernate_Util.getSessionFactory();
			session = factory.openSession();
			tnx = session.beginTransaction();
			Customer cust = new Customer(cto.getCid(), cto.getName(), cto.getEmail(), cto.getPhone());
			session.save(cust);
			tnx.commit();

		} catch (Exception e) {
			tnx.rollback();
			e.printStackTrace();
		} finally {

			if (session != null)
				session.close();
		}

	}

	@Override
	public void updateCustomer(CustomerTO cto) {
		Transaction tnx = null;
		SessionFactory factory = null;
		Session session = null;
		try {
			factory = Hibernate_Util.getSessionFactory();
			session = factory.openSession();
			tnx = session.beginTransaction();
			Customer cust = new Customer(cto.getCid(), cto.getName(), cto.getEmail(), cto.getPhone());
			session.update(cust);
			tnx.commit();

		} catch (Exception e) {
			tnx.rollback();
			e.printStackTrace();
		} finally {

			if (session != null)
				session.close();
		}

	}

	@Override
	public void deleteCustomer(CustomerTO cto) {
		// TODO Auto-generated method stub
		Transaction tnx = null;
		SessionFactory factory = null;
		 
		try {
			factory = Hibernate_Util.getSessionFactory();
			Session session = factory.openSession();
			tnx = session.beginTransaction();
			Customer cust = (Customer) session.load(Customer.class, cto.getCid());
			session.delete(cust);
			tnx.commit();
			session.close();
		} catch (Exception e) {
			tnx.rollback();
			e.printStackTrace();
		} 
	}

	@Override
	public CustomerTO getCustomerByCid(int cid) {
		Transaction tnx = null;
		CustomerTO cto = null;
		 SessionFactory factory = null;
		try {
			factory = Hibernate_Util.getSessionFactory();
			Session session = factory.openSession();
			tnx = session.beginTransaction();
			Customer cust = (Customer) session.load(Customer.class, cid);
			cto = new CustomerTO(cust.getCid(), cust.getName(), cust.getEmail(), cust.getPhone());
			tnx.commit();
			session.close();
		} catch (Exception e) {
			tnx.rollback();
			e.printStackTrace();
		}
		return cto;
	}

}
