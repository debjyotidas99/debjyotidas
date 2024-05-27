package com.jtc.hibernate_project_5;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="weekdays_student")
@PrimaryKeyJoinColumn(name="mysid")
public class Weekdays_Student extends Current_Student {
	@Column(name="yop")
	private int yop;
	@Column(name="percentage")
	private double percentage;
	@Column(name="qualification")
	private String qualification;

	public Weekdays_Student(String name, String city, int age, long phone, double salary, String company, String email,
			int yop, double percentage, String qualification) {
		super(name, city, age, phone, salary, company, email);
		this.yop = yop;
		this.percentage = percentage;
		this.qualification = qualification;
	}

	public Weekdays_Student(int id, String name, String city, int age, long phone, double salary, String company,
			String email, int yop, double percentage, String qualification) {
		super(id, name, city, age, phone, salary, company, email);
		this.yop = yop;
		this.percentage = percentage;
		this.qualification = qualification;
	}

	public int getYop() {
		return yop;
	}

	public void setYop(int yop) {
		this.yop = yop;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	@Override
	public String toString() {
		return "Weekdays_Student [yop=" + yop + ", percentage=" + percentage + ", qualification=" + qualification + "]";
	}

}
