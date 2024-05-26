package com.jtc.spring_3;

public class B {
	int b;
	String name;

	B() {
		System.out.println("Default constructor in B");
	}

	public B(int b, String name) {
		super();
		this.b = b;
		this.name = name;
	}

	@Override
	public String toString() {
		return "B [b=" + b + ", name=" + name + "]";
	}

}
