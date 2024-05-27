package com.jtc.hibernate_project_8;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
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

	@OneToOne(mappedBy = "address", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Employee employee;

	public Address() {
		super();
	}

	public Address(String street, String nearby, String city, int pincode, Employee employee) {
		super();
		this.street = street;
		this.nearby = nearby;
		this.city = city;
		this.pincode = pincode;
		this.employee = employee;
	}

	public Address(int id, String street, String nearby, String city, int pincode) {
		super();
		this.id = id;
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

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", street=" + street + ", nearby=" + nearby + ", city=" + city + ", pincode="
				+ pincode + ", employee=" + employee + "]";
	}

}
