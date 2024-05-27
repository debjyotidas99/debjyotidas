package com.jtc.hibernate_project_11;

public class Client {
	public static void main(String[] args) {
		Hibernate_Template temp = new Hibernate_Template();
		CustomerDAO cdao = new HibernateCustomerDAO(temp);
		CustomerTO cto = cdao.getCustomerByCid(69);
		System.out.println(cto);
		
		
	}
}
