package com.jtc.spring_7;

public class A {
	B b;

	public A() {
		super(); 
	}

	public A(B b) {
		super();
		this.b = b;
	}

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "A [b=" + b + "]";
	}

}
