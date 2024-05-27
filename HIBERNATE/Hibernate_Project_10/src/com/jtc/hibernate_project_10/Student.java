package com.jtc.hibernate_project_10;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "stu_id")
	private int stu_id;
	@Column(name = "name")
	private String name;
	@Column(name = "age")
	private int age;
	@Column(name = "email")
	private String email;

	@ManyToMany()
	@JoinTable(name = "stu_cou", joinColumns = @JoinColumn(name = "sid", referencedColumnName = "stu_id"), inverseJoinColumns = @JoinColumn(name = "cid", referencedColumnName = "cou_id"))
	private Set<Course> course;

	public Student(int stu_id, String name, int age, String email, Set<Course> course) {
		super();
		this.stu_id = stu_id;
		this.name = name;
		this.age = age;
		this.email = email;
		this.course = course;
	}

	public Student(int stu_id, String name, int age, String email) {
		super();
		this.stu_id = stu_id;
		this.name = name;
		this.age = age;
		this.email = email;
	}

	public Student(String name, int age, String email, Set<Course> course) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.course = course;
	}

	public Student(String name, int age, String email) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
	}

	public int getId() {
		return stu_id;
	}

	public void setId(int stu_id) {
		this.stu_id = stu_id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<Course> getCourse() {
		return course;
	}

	public void setCourse(Set<Course> course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [stu_id=" + stu_id + ", name=" + name + ", age=" + age + ", email=" + email + ", course="
				+ course + "]";
	}

}
