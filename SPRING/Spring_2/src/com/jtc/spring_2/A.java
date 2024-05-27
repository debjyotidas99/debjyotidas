package com.jtc.spring_2;

public class A {
	int a;
	String name;

	public A(int a) {
		super();
		this.a = a;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "A [a=" + a + ", name=" + name + "]";
	}

}
