package com.jtc.spring_3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@org.springframework.context.annotation.Configuration
public class Configuration {

	static {
		System.out.println("Hello World");
	}

	@Bean("Abean")
	@Scope("prototype")
	@Lazy(true)
	public A createA() {
		System.out.println("A bean is loading");
		A a = new A();
		a.setA(101);
		a.setName("A");
		return a;
	}

	@Bean("Bbean")
	@Scope("singleton")
	@Lazy(true)
	public B createB() {
		System.out.println("B bean is loading");
		B b = new B(201, "B");
		return b;
	}

	/*@Bean("Cbean")
	@Scope("singleton")
	@Lazy(false)
	public C createC(A a, B b) {
		System.out.println("C bean is loading");
		C c = new C(a);
		c.setB(b);
		return c;
	}*/
}