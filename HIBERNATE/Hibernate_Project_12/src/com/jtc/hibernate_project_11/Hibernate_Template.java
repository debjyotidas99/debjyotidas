package com.jtc.hibernate_project_11;

import java.io.Serializable;

import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Hibernate_Template {
	// SAVE
	public void save(Object obj) {
		Transaction txn = null;
		try {
			SessionFactory sessionFactory = Hibernate_Util.getSessionFactory();
			Session session = sessionFactory.openSession();
			txn = session.beginTransaction();
			session.save(obj);
			txn.commit();
			session.close();
		} catch (Exception e) {
			if (txn != null)
				txn.rollback();
			e.printStackTrace();
		}

	}

	// UPDATE
	public void update(Object obj) {
		Transaction txn = null;
		try {
			SessionFactory sessionFactory = Hibernate_Util.getSessionFactory();
			Session session = sessionFactory.openSession();
			txn = session.beginTransaction();
			session.update(obj);
			txn.commit();
			session.close();
		} catch (Exception e) {
			if (txn != null)
				txn.rollback();
			e.printStackTrace();
		}

	}

	// DELETE
	public void delete(Class<?> myclass, Serializable id) {
		Transaction txn = null;
		try {
			SessionFactory sessionFactory = Hibernate_Util.getSessionFactory();
			Session session = sessionFactory.openSession();
			txn = session.beginTransaction();
			Object obj = session.load(myclass, id);
			session.delete(obj);
			txn.commit();
			session.close();
		} catch (Exception e) {
			if (txn != null)
				txn.rollback();
			e.printStackTrace();
		}

	}

	// LOAD
	@SuppressWarnings("deprecation")
	public Object load(@SuppressWarnings("rawtypes") Class myclass, Serializable id) {
		Transaction txn = null;
		Object obj = null;
		try {
			SessionFactory sessionFactory = Hibernate_Util.getSessionFactory();
			Session session = sessionFactory.openSession();
			txn = session.beginTransaction();
			obj = session.load(myclass, id, LockMode.READ);
			txn.commit();
			session.close();
		} catch (Exception e) {
			if (txn != null)
				txn.rollback();
			e.printStackTrace();
		}
		return obj;

	}
}
