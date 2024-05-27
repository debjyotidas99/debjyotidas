package com.jtc.hibernate_project_11;

public class Client {
	public static void main(String[] args) {
		CustomerDAO cdao = new HibernateCustomerDAO();
		CustomerTO cto = cdao.getCustomerByCid(66);
		System.out.println(cto);
		
	}
}
