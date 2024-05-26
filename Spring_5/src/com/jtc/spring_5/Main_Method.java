package com.jtc.spring_5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main_Method {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Configuration_1.class,Configuration_2.class,Configuration_3.class);
		A a = (A) ctx.getBean("ABean");
		System.out.println(a);
		B b = (B) ctx.getBean("BBean");
		System.out.println(b);
		ParentA pa = (ParentA) ctx.getBean("ParentA");
		pa.showParentA();
		ParentB pb = (ParentB) ctx.getBean("ParentB");
		pb.showParentB();
	}
}
