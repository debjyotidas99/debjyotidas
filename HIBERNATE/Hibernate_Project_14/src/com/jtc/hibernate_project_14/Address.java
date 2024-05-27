package com.jtc.hibernate_project_14;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	private String city;
	private String dist;
	private String tah;
	private int pincode;

	public Address() {
		super();
	}

	public Address(String city, String dist, String tah, int pincode) {
		super();
		this.city = city;
		this.dist = dist;
		this.tah = tah;
		this.pincode = pincode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDist() {
		return dist;
	}

	public void setDist(String dist) {
		this.dist = dist;
	}

	public String getTah() {
		return tah;
	}

	public void setTah(String tah) {
		this.tah = tah;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", dist=" + dist + ", tah=" + tah + ", pincode=" + pincode + "]";
	}

}
