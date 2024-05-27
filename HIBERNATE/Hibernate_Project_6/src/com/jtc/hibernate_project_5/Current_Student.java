package com.jtc.hibernate_project_5;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "current_student")
@DiscriminatorValue("CSTU")
public class Current_Student extends IT_Student {
	@Column(name = "salary")
	private double salary;
	@Column(name = "company")
	private String company;
	@Column(name = "email")
	private String email;

	public Current_Student(String name, String city, int age, long phone, double salary, String company, String email) {
		super(name, city, age, phone);
		this.salary = salary;
		this.company = company;
		this.email = email;
	}

	public Current_Student(int id, String name, String city, int age, long phone, double salary, String company,
			String email) {
		super(id, name, city, age, phone);
		this.salary = salary;
		this.company = company;
		this.email = email;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Current_Student [salary=" + salary + ", company=" + company + ", email=" + email + "]";
	}

}
