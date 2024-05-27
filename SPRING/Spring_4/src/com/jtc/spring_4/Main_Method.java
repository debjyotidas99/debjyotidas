package com.jtc.spring_4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main_Method {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(Configuration.class);
		singletonDesignPattern sdp = (singletonDesignPattern) ctx.getBean("singletonbean");
		singletonDesignPattern.show();
		singletonDesignPattern sdp1 = (singletonDesignPattern) ctx.getBean("singletonbean");
		singletonDesignPattern.show();

		System.out.println(sdp == sdp1);

	}
}
