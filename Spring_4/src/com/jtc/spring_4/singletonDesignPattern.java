package com.jtc.spring_4;

public class singletonDesignPattern {
	static singletonDesignPattern singleton;

	 static{
		singleton = new singletonDesignPattern();
	}

	 @SuppressWarnings("unused")
	private static final singletonDesignPattern sdp = new singletonDesignPattern();

	 private singletonDesignPattern() {}
	

	public static singletonDesignPattern getSingletonDesignPattern() {
		return singleton;
	}

	public static singletonDesignPattern show() {
		System.out.println("show method");
		return singleton;
	}
}
