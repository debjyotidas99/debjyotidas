package com.jtc.spring_7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main_Method {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Configuration.class);
		
		A a = (A)ctx.getBean("ABean");
		System.out.println(a);
	}
}
