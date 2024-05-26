package com.jtc.spring_2;

public class Main_Method {
	public static void main(String[] args) {
		A a = new A(101);
		a.setName("A");
		
		B b = new B();
		b.setB(201);
		b.setName("B");
		
		C c = new C(a);
		c.setB(b);
		c.show();
		
	}
}
