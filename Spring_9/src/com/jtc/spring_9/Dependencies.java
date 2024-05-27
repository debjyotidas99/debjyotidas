package com.jtc.spring_9;

public class Dependencies {
	A a;
	CustomerDAO custDAO;
	public A getA() {
		return a;
	}
	public CustomerDAO getCustDAO() {
		return custDAO;
	}
	public void setA(A a) {
		this.a = a;
	}
	public void setCustDAO(CustomerDAO custDAO) {
		this.custDAO = custDAO;
	}
	
	public void show() {
		System.out.println("show method*********");
		System.out.println(a);
		System.out.println(custDAO);
	}
}
