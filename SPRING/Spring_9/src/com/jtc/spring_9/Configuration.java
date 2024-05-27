package com.jtc.spring_9;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {

	/*@Bean("ABean")
	public A createA() {
		System.out.println("createABean");
		A a = new A();
		return a;
	}*/
	
	@Bean("BBean")
	public B createB() {
		System.out.println("createBBean");
		B b = new B();
		return b;
	}

	@Bean("daoBean")
	public CustomerDAO createDAO() {
		System.out.println("createDAOBean");
		return new ImplementationClass();
	}

	@Bean(name = "createDependencies", autowire = Autowire.BY_TYPE)
	public Dependencies createDependencies() {
		System.out.println("createDependenciesBean");
		Dependencies dep = new Dependencies();
		return dep;

	}
}
