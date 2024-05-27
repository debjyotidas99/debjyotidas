package com.jtc.spring_4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@org.springframework.context.annotation.Configuration
public class Configuration {
	@Bean("singletonbean")
	@Scope("prototype")
	public singletonDesignPattern createSingleton() {
		System.out.println("I am createSingleton");
		singletonDesignPattern s = singletonDesignPattern.show();
		return s;
	}

	@Bean("runtimebean")
	public Runtime createRuntime() {
		System.out.println("I am createRuntime");
		Runtime r = Runtime.getRuntime();
		return r;
	}
}
