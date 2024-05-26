package com.jtc.spring_6;

public class Address {
	private String city;
	private String district;
	private int pincode;

	public Address() {
		super();
	}

	public Address(String city, String district, int pincode) {
		super();
		this.city = city;
		this.district = district;
		this.pincode = pincode;
	}

	public String getCity() {
		return city;
	}

	public String getDistrict() {
		return district;
	}

	public int getPincode() {
		return pincode;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", district=" + district + ", pincode=" + pincode + "]";
	}

}
