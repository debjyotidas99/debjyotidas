package com.jtc.spring_7;

import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {
	@Bean("BBean")
	public B createB() {
		System.out.println("BBBean");
		B b = new B();
		return b;
	}
	
	@Bean("BBean")
	public B createBB() {
		System.out.println("BBean");
		B b = new B();
		return b;
	}
	
	@Bean("ABean")
	public A createA(B b) {
		System.out.println("ABean");
		A a = new A();
		a.setB(b);
		return a;
	}
}
