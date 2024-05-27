package com.jtc.hibernate_project_8;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

public class Hibernate_Util {
	static SessionFactory factory =null;
	
	static {
		try {
			Configuration cfg = new Configuration();
			Properties pro = new Properties();
			pro.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
			pro.put(Environment.URL, "jdbc:mysql://@localhost:3306/employee");
			pro.put(Environment.USER, "root");
			pro.put(Environment.PASS, "Mysql@1234");
			pro.put(Environment.POOL_SIZE, "99");
			pro.put(Environment.SHOW_SQL, "true");
			pro.put(Environment.HBM2DDL_AUTO, "update");
			pro.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
			pro.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
			cfg.setProperties(pro);
			cfg.addAnnotatedClass(Employee.class);
			cfg.addAnnotatedClass(Address.class);
			StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder();
			ServiceRegistry sr = ssrb.applySettings(cfg.getProperties()).build();
			factory = cfg.buildSessionFactory(sr);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static SessionFactory getSessionFactory() {
		return factory;
	}
}

//oracle.jdbc.driver.OracleDriver
//jdbc:oracle:thin:@localhost:1521:XE
//sys as sysdba
//Myoracle@1234
//OracleDialect
