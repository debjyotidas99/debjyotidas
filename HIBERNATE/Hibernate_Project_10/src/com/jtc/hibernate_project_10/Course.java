package com.jtc.hibernate_project_10;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="courses")
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cou_id")
	private int cou_id;
	@Column(name="course_name")
	private String course_name;
	@Column(name="fees")
	private double fees;
	@Column(name="trainer")
	private String trainer;

	@ManyToMany(mappedBy = "course")
	private Set<Student> student;

	public Course(int cou_id, String course_name, double fees, String trainer, Set<Student> student) {
		super();
		this.cou_id = cou_id;
		this.course_name = course_name;
		this.fees = fees;
		this.trainer = trainer;
		this.student = student;
	}

	public Course(String course_name, double fees, String trainer, Set<Student> student) {
		super();
		this.course_name = course_name;
		this.fees = fees;
		this.trainer = trainer;
		this.student = student;
	}

	public Course(String course_name, double fees, String trainer) {
		super();
		this.course_name = course_name;
		this.fees = fees;
		this.trainer = trainer;
	}

	public int getCou_id() {
		return cou_id;
	}

	public void setCou_id(int cou_id) {
		this.cou_id = cou_id;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public String getTrainer() {
		return trainer;
	}

	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}

	public Set<Student> getStudent() {
		return student;
	}

	public void setStudent(Set<Student> student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Course [cou_id=" + cou_id + ", course_name=" + course_name + ", fees=" + fees + ", trainer=" + trainer
				+ ", student=" + student + "]";
	}

}
