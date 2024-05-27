package com.jtc.hibernate_project_5;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="weekends_student")
@DiscriminatorValue("WENDS")
public class Weekends_Student extends Current_Student {
	@Column(name="marital_status")
	private String marital_status;
	@Column(name="ctc")
	private String ctc;
	@Column(name="joblocation ")
	private String joblocation;

	public Weekends_Student(String name, String city, int age, long phone, double salary, String company, String email,
			String marital_status, String ctc, String joblocation) {
		super(name, city, age, phone, salary, company, email);
		this.marital_status = marital_status;
		this.ctc = ctc;
		this.joblocation = joblocation;
	}

	public Weekends_Student(int id, String name, String city, int age, long phone, double salary, String company,
			String email, String marital_status, String ctc, String joblocation) {
		super(id, name, city, age, phone, salary, company, email);
		this.marital_status = marital_status;
		this.ctc = ctc;
		this.joblocation = joblocation;
	}

	public String getMarital_status() {
		return marital_status;
	}

	public void setMarital_status(String marital_status) {
		this.marital_status = marital_status;
	}

	public String getCtc() {
		return ctc;
	}

	public void setCtc(String ctc) {
		this.ctc = ctc;
	}

	public String getJoblocation() {
		return joblocation;
	}

	public void setJoblocation(String joblocation) {
		this.joblocation = joblocation;
	}

	@Override
	public String toString() {
		return "Weekends_Student [marital_status=" + marital_status + ", ctc=" + ctc + ", joblocation=" + joblocation
				+ "]";
	}

}
