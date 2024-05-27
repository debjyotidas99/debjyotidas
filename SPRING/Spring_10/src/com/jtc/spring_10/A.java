package com.jtc.spring_10;

import org.springframework.beans.factory.annotation.Autowired;

public class A {
	@Autowired(required = false)
	B b;

	public void show() {
		System.out.println("show in A");
		System.out.println(b);
	}
}
