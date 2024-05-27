package com.jtc.spring_10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class A {
	
	@Autowired(required = false)
	@Qualifier("bb")
	B b;

	public void show() {
		System.out.println("show in A");
		System.out.println(b);
	}
}
