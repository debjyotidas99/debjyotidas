package com.jtc.hibernate_project_15;

import java.util.Date;
import java.util.Set;

public class Order {
	private int order_Id;
	private Date order_date;
	private int total_Quantity;
	private Date deliveryDate;
	private double total_Cost;
	
	private Set<Customer> customer;
	private Shipping_Address address;
}
