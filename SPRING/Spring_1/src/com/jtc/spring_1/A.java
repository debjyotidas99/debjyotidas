package com.jtc.spring_1;

public class A {
	int a;
	String name;

	public A(int a, String name) {
		super();
		this.a = a;
		this.name = name;
	}

	@Override
	public String toString() {
		return "A [a=" + a + ", name=" + name + "]";
	}

}
