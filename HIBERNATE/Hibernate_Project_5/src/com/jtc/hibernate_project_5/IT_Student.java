
package com.jtc.hibernate_project_5;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "it_student")
@Inheritance(strategy = InheritanceType.JOINED)
public class IT_Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "city")
	private String city;
	@Column(name = "age")
	private int age;
	@Column(name = "phone")
	private long phone;

	public IT_Student(String name, String city, int age, long phone) {
		super();
		this.name = name;
		this.city = city;
		this.age = age;
		this.phone = phone;
	}

	public IT_Student(int id, String name, String city, int age, long phone) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.age = age;
		this.phone = phone;
	}

	public IT_Student() {
		super();
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "IT_Student [id=" + id + ", name=" + name + ", city=" + city + ", age=" + age + ", phone=" + phone + "]";
	}

}
