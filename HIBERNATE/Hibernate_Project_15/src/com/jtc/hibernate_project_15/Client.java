package com.jtc.hibernate_project_15;

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
		Transaction txn = null;
		try {
			SessionFactory factory = Hibernate_Util.getSessionFactory();
			Session session = factory.openSession();
			txn = session.beginTransaction();

			// Book_List
						Book book1 = new Book("Core Java", 650, 2019);
						session.save(book1);
						Book book2 = new Book("Advance Java", 899, 2021);
						session.save(book2);
						Book book3 = new Book("Pyhton Full Stack", 1230, 2022);
						session.save(book3);
						Set<Book> book = new HashSet<Book>();
						book.add(book1);
						book.add(book2);
						book.add(book3);
						
			// Author_List
			//-------------------------------------Author-A-------------------------------------------	
			
			
						List<String> qua = new ArrayList<String>();
						qua.add("B.Tech");
						qua.add("M.Tech");
						qua.add("Phd");
						
						Set<String> skill = new HashSet<String>();
						skill.add("Java");
						skill.add("Python");
						
						Map<String, Integer>exp= new HashMap<String, Integer>();
						exp.put("Flipkart", 3);
						Author a = new Author("som rai", "som@gmail.com", 61801787,qua,skill,exp);
						session.save(a);
	//-------------------------------------Author-B-------------------------------------------					
						qua = new ArrayList<String>();
						qua.add("B.Tech");
						qua.add("M.Tech");
						
						skill = new HashSet<String>();
						skill.add("Ruby");
						skill.add("PHP");
						skill.add("C++");
						
						exp = new HashMap<String, Integer>();
						exp.put("Google", 5);
						exp.put("Amazon", 10);
						exp.put("Cognizant", 7);
						Author b = new Author("vivek", "vivek@gmail.com.com", 947867520,qua,skill,exp);
						session.save(b);
						
	//-------------------------------------Author-C-------------------------------------------					

						qua = new ArrayList<String>();
						qua.add("B.Tech");
						qua.add("Phd");
						
						skill = new HashSet<String>();
						skill.add("Ruby");
						skill.add("C");
						skill.add("C#");
						
						exp = new HashMap<String, Integer>();
						exp.put("Google", 5);
						exp.put("Amazon", 10);
						Author c = new Author("Arvind", "arvind@gmail.com", 811497941,qua,skill,exp);
						session.save(c);
						
						

			Set<Author> aut = new HashSet<Author>();
			aut.add(a);
			book1.setAuthor(aut);

			aut = new HashSet<Author>();
			aut.add(b);
			aut.add(c);
			book2.setAuthor(aut);

			aut = new HashSet<Author>();
			aut.add(a);
			aut.add(b);
			aut.add(c);
			book3.setAuthor(aut);
			
			txn.commit();
			session.close();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			if (txn != null)
				txn.rollback();
		}
	}
}
