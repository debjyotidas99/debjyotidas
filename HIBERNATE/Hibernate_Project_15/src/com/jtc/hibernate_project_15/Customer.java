package com.jtc.hibernate_project_15;

import java.util.Set;

public class Customer {
	private int customer_Id;
	private String customer_Name;
	private String customer_Email;
	private long customer_Phone;
	
	private Set<Credit_Card> creditcard;
	private Set<Order> order;
}
