package com.jtc.spring_6;

import java.util.List;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main_Method {
	@SuppressWarnings({ "unchecked", "resource" })
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Configuration.class);
		Customer cust = (Customer) ctx.getBean("getCustomer");
		System.out.println(cust);
		System.out.println(cust.getAddress());
		List<Account> account = (List<Account>) ctx.getBean("getAccount");
		for (Account acc : account) {
			System.out.println(acc);
		}
		List<String> emails = (List<String>)ctx.getBean("getEmails");
		for (String email : emails) {
			System.out.println(email);
		}
		Set<Long> phones = (Set<Long>)ctx.getBean("getPhones");
		for (Long phone : phones) {
			System.out.println(phone);
		}
		
	}
}
