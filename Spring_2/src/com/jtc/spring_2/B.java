package com.jtc.spring_2;

public class B {
	int b;
	String name;

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "B [b=" + b + ", name=" + name + "]";
	}

}
