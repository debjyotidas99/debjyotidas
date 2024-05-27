package com.jtc.spring_3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main_Method {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext acon = new AnnotationConfigApplicationContext(Configuration.class);
		A a = (A) acon.getBean("Abean");
		System.out.println(a);
		B b = (B) acon.getBean("Bbean");
		System.out.println(b);
		
	}
}
