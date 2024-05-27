package com.jtc.hibernateAnnotation;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

@SuppressWarnings("deprecation")
public class HibernateUtil {
	static SessionFactory factory = null;

	static {
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg = cfg.configure("customers.cfg.xml");
		factory = cfg.buildSessionFactory();

	}

	public static SessionFactory getSessionFactory() {
		return factory;
	}
}
