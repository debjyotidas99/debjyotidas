package com.jtc.hibernate_1;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

@SuppressWarnings("deprecation")
public class Hibernate_Util {

	static SessionFactory factory = null;
	
	static {
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg = cfg.configure("hibernate_1.cfg.xml");
		factory = cfg.buildSessionFactory();
	}
	public static SessionFactory getSessionFactory() {
		return factory;
	}
}
