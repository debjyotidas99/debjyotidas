package com.jtc.spring_5;

public class A {
	int a;
	String name;

	public A() {
		super();
	}

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
