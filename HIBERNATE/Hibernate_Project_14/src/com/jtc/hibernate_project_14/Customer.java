package com.jtc.hibernate_project_14;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customers")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "age")
	private int age;
	@Column(name = "dept")
	private String dept;

	@Embedded
	@AttributeOverrides({ @AttributeOverride(name = "city", column = @Column(name = "city")),
			@AttributeOverride(name = "dist", column = @Column(name = "dist")),
			@AttributeOverride(name = "tah", column = @Column(name = "tah")),
			@AttributeOverride(name = "pincode", column = @Column(name = "pincode")) })
	private Address address;

	public Customer() {
		super();
	}

	public Customer(int id, String name, int age, String dept, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.dept = dept;
		this.address = address;
	}

	public Customer(String name, int age, String dept, Address address) {
		super();
		this.name = name;
		this.age = age;
		this.dept = dept;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", age=" + age + ", dept=" + dept + "]";
	}

}
