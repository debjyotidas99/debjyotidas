package com.jtc.hibernate_project_10;

import java.util.HashSet;
import java.util.Set;

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
			
			Course cou1 = new Course("HIbernate", 6000, "somrai");
			session.save(cou1);
			Course cou2 = new Course("Servlet", 5000, "somrai");
			session.save(cou2);
			Course cou3 = new Course("JavaScript", 10000, "somrai");
			session.save(cou3);
			
			Student stu1 = new Student("sushmita", 20, "sushmita@gmail.com");
			session.save(stu1);
			Set<Course> course = new HashSet<Course>();
			course.add(cou1);
			course.add(cou2);
			course.add(cou3);
			stu1.setCourse(course);
			
			Student stu2 = new Student("Debjyoti", 24, "debjyoti@gmail.com");
			session.save(stu2);
			course = new HashSet<Course>();
			course.add(cou3);
			course.add(cou1);
			stu2.setCourse(course);
			
			Student stu3 = new Student("Sumit", 20, "suraj@gmail.com");
			session.save(stu3);
			course = new HashSet<Course>();
			course.add(cou2);
			course.add(cou3);
			stu3.setCourse(course);
			
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
