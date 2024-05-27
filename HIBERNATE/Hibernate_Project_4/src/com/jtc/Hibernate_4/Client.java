package com.jtc.Hibernate_4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Client {
	public static void main(String[] args) {
		Transaction tnx = null;
		
		String[] courses = {"Core Java", "Exception Handling", "Hibernate", "Servlet"};
		
		List<String> skills = new ArrayList<String>();
		skills.add("JSP");
		skills.add("Servlet");
		skills.add("Hibernate");
		
		Set<Integer> marks = new HashSet<Integer>();
		marks.add(89);
		marks.add(99);
		marks.add(73);
		marks.add(81);
		marks.add(67);
		
		Map<Integer,String> preference = new HashMap<Integer, String>();
		preference.put(2, "Amazon");
		preference.put(3, "Flipkart");
		preference.put(1, "Messho");
		preference.put(4, "Google");
		
		try {
			SessionFactory factory = Hibernate_Util.getSessionFactory();
			Session session = factory.openSession();
			tnx = session.beginTransaction();
			Student std = new Student("Suraj", "Gadchiroli", 8245784, 18, courses, skills, marks, preference);
			session.save(std);
			tnx.commit();
			session.close();
		}catch(Exception e) {
			//tnx.rollback();
			e.printStackTrace();
		}
	}
}