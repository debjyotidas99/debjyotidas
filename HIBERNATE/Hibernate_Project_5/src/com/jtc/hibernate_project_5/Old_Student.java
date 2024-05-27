package com.jtc.hibernate_project_5;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="old_student")
@PrimaryKeyJoinColumn(name="mysid")
public class Old_Student extends IT_Student {
	@Column(name="feebalance")
	private int feebalance;
	@Column(name="timing")
	private String timing;
	@Column(name="trainer")
	private String trainer;

	public Old_Student(String name, String city, int age, long phone, int feebalance, String timing, String trainer) {
		super(name, city, age, phone);
		this.feebalance = feebalance;
		this.timing = timing;
		this.trainer = trainer;
	}

	public Old_Student(int id, String name, String city, int age, long phone, int feebalance, String timing,
			String trainer) {
		super(id, name, city, age, phone);
		this.feebalance = feebalance;
		this.timing = timing;
		this.trainer = trainer;
	}

	public int getFeebalance() {
		return feebalance;
	}

	public void setFeebalance(int feebalance) {
		this.feebalance = feebalance;
	}

	public String getTiming() {
		return timing;
	}

	public void setTiming(String timing) {
		this.timing = timing;
	}

	public String getTrainer() {
		return trainer;
	}

	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}

	@Override
	public String toString() {
		return "Old_Student [feebalance=" + feebalance + ", timing=" + timing + ", trainer=" + trainer + "]";
	}

}
