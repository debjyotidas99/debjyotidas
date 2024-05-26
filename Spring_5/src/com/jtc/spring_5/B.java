package com.jtc.spring_5;

public class B {
	int b;
	String name;

	public B() {
		super();
	}

	public void setB(int b) {
		this.b = b;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "B [b=" + b + ", name=" + name + "]";
	}

}
