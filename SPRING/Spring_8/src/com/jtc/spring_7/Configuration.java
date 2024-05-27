package com.jtc.spring_7;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {
	@Bean("b1")
	public B createBB() {
		System.out.println("BBBean");
		B b = new B();
		return b;
	}

	@Bean("b1")
	public B createB() {
		System.out.println("BBean*********");
		B b = new B();
		return b;
	}

	@Bean("b1")
	public B createBBB() {
		System.out.println("BBean-------");
		B b = new B();
		return b;
	}

	@Bean(name = "ABean", autowire = Autowire.BY_TYPE)
	public A createA() {
		System.out.println("ABean");
		A a = new A();
		return a;
	}
}
