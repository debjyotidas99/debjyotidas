package com.jtc.hibernate_project_7;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "address_info")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "aid")
	private int id;
	@Column(name = "street")
	private String street;
	@Column(name = "nearby")
	private String nearby;
	@Column(name = "city")
	private String city;
	@Column(name = "pincode")
	private int pincode;
	
	

	public Address() {
		super();
	}

	public Address(String street, String nearby, String city, int pincode) {
		super();
		this.street = street;
		this.nearby = nearby;
		this.city = city;
		this.pincode = pincode;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getNearby() {
		return nearby;
	}

	public void setNearby(String nearby) {
		this.nearby = nearby;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", street=" + street + ", nearby=" + nearby + ", city=" + city + ", pincode="
				+ pincode + "]";
	}

}
