package com.jtc.spring_3;

public class A {
	int a;
	String name;

	A() {
		
	}

	public void setA(int a) {
		this.a = a;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "A [a=" + a + ", name=" + name + "]";
	}

}
