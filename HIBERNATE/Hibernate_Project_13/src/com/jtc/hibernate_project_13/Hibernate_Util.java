package com.jtc.hibernate_project_13;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;


public class Hibernate_Util {
static SessionFactory sessionFactory = null;
	
	static {
		try {
			Configuration cfg = new Configuration();
			Properties pro = new Properties();
			pro.put(Environment.DRIVER, "oracle.jdbc.driver.OracleDriver");
			pro.put(Environment.URL, "jdbc:oracle:thin:@localhost:1521:XE");
			pro.put(Environment.USER, "sys as sysdba");
			pro.put(Environment.PASS, "Myoracle@1234");
			pro.put(Environment.SHOW_SQL, "true");
			pro.put(Environment.POOL_SIZE, "99");
			pro.put(Environment.HBM2DDL_AUTO, "update");
			pro.put(Environment.DIALECT, "org.hibernate.dialect.OracleDialect");
			cfg.setProperties(pro);
			cfg.addAnnotatedClass(Worker.class);
			StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder();
			ServiceRegistry sr = ssrb.applySettings(cfg.getProperties()).build();
			sessionFactory = cfg.buildSessionFactory(sr);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
