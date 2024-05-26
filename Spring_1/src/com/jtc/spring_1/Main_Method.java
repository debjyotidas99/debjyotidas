package com.jtc.spring_1;

public class Main_Method {
	public static void main(String[] args) {
		A a = new A(101, "A");
		System.out.println(a);
		B b = new B();
		b.setB(201);
		b.setName("B");
		System.out.println(b);
	}
}
