package com.jtc.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

@SuppressWarnings("deprecation")
public class Hibernate_Util {
	static SessionFactory factory = null;

	static {
		Configuration cfg = new Configuration();
		cfg = cfg.configure("customer.cfg.xml");
		factory = cfg.buildSessionFactory();
	}

	public static SessionFactory getSessionFactory() {
		return factory;

	}
}
