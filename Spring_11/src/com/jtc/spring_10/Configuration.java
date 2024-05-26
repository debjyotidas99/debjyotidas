package com.jtc.spring_10;

import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {
	
	@Bean("bb1")
	public B createB() {
		B b = new B();
		b.setMsg("Hello B");
		return b;
	}
	
	@Bean("bb2")
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
