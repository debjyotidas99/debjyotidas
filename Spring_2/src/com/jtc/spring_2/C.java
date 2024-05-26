package com.jtc.spring_2;

public class C {
	A a;
	B b;

	public C(A a) {
		super();
		this.a = a;
	}

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}

	public void show() {
		System.out.println(a);
		System.out.println(b);
	}

	@Override
	public String toString() {
		return "C [a=" + a + ", b=" + b + "]";
	}

}
