package com.jtc.hibernate_project_15;

import java.util.Set;

public class Credit_Card {
	private int card_Number;
	private int expiry_Date;
	private double limit;
	private int cvv;
	
	private Set<Customer> customer;
}
