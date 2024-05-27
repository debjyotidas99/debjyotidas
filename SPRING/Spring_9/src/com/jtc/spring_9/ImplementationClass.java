package com.jtc.spring_9;

public class ImplementationClass implements CustomerDAO {

	@Override
	public void addCustomer() {
		System.out.println("addCustomer method in ImplementationClass");
	}

	@Override
	public String toString() {
		return "ImplementationClass []";
	}

}
