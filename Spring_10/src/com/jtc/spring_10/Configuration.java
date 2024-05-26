package com.jtc.spring_10;

import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {
	
	@Bean("b")
	public B createB() {
		B b = new B();
		b.setMsg("Hello B");
		return b;
	}
	
	@Bean("BBeans")
	public B createBB() {
		B b = new B();
		b.setMsg("Hello B");
		return b;
	}
	
	@Bean("ABean")
	public A createA() {
		return new A();
	}
}
