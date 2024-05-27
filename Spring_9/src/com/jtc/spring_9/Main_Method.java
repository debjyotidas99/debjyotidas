package com.jtc.spring_9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main_Method {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Configuration.class);
		Dependencies dep = (Dependencies) ctx.getBean("createDependencies");
		dep.show();
	}
}
