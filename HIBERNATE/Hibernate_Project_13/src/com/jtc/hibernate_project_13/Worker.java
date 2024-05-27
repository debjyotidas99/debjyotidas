package com.jtc.hibernate_project_13;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

@Entity
@Table(name = "worker")
public class Worker {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "age")
	private int age;
	@Column(name = "city")
	private String city;

	// @Version
	// private int version;

	@Version
	@Temporal(TemporalType.TIMESTAMP)
	private Date timeStamp;

	public Worker() {
		super();
	}

	/*
	 * public Worker(int id, String name, int age, String city, int version) {
	 * super(); this.id = id; this.name = name; this.age = age; this.city = city;
	 * this.version = version; }
	 */

	/*
	 * public Worker(String name, int age, String city, int version) { super();
	 * this.name = name; this.age = age; this.city = city; this.version = version; }
	 */

	public Worker(String name, int age, String city) {
		super();
		this.name = name;
		this.age = age;
		this.city = city;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	/*
	 * public int getVersion() { return version; }
	 * 
	 * public void setVersion(int version) { this.version = version; }
	 */

	@Override
	public String toString() {
		return "Worker [id=" + id + ", name=" + name + ", age=" + age + ", city=" + city + "]";
	}

}
