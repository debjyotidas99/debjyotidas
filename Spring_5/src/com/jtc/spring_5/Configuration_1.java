package com.jtc.spring_5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Configuration_1 {
	
	@Bean("ABean")
	public A createA() {
		A a = new A(101, "A");
		return a;
	}
	
	@Bean("BBean")
	public B createB() {
		B b = new B();
		b.setB(201);
		b.setName("B");
		return b;
	}
}
