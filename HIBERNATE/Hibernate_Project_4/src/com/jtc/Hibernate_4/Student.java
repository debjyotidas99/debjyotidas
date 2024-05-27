package com.jtc.Hibernate_4;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

@Entity
@Table(name = "student_details")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "city")
	private String city;
	@Column(name = "phone")
	private long phone;
	@Column(name = "age")
	private int age;

	@ElementCollection
	@CollectionTable(name = "mycourse", joinColumns = @JoinColumn(name = "mysid"))
	@OrderColumn(name = "trainingOrder")
	@Column(name = "courseName")
	private String[] course;

	@ElementCollection
	@CollectionTable(name = "myskills", joinColumns = @JoinColumn(name = "mysid"))
	@OrderColumn(name = "expertiseOrder")
	@Column(name = "skillName")
	private List<String> skills;

	@ElementCollection
	@CollectionTable(name = "mymarks", joinColumns = @JoinColumn(name = "mysid"))
	@Column(name = "marks")
	private Set<Integer> marks;

	@ElementCollection
	@CollectionTable(name = "mypreference", joinColumns = @JoinColumn(name = "mysid"))
	@Column(name = "preference")
	private Map<Integer, String> preference;

	public Student(String name, String city, long phone, int age, String[] course, List<String> skills,
			Set<Integer> marks, Map<Integer, String> preference) {

		this.name = name;
		this.city = city;
		this.phone = phone;
		this.age = age;
		this.course = course;
		this.skills = skills;
		this.marks = marks;
		this.preference = preference;
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

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String[] getCourse() {
		return course;
	}

	public void setCourse(String[] course) {
		this.course = course;
	}

	public List<String> getSkills() {
		return skills;
	}

	public void setSkills(List<String> skills) {
		this.skills = skills;
	}

	public Set<Integer> getMarks() {
		return marks;
	}

	public void setMarks(Set<Integer> marks) {
		this.marks = marks;
	}

	public Map<Integer, String> getPreference() {
		return preference;
	}

	public void setPreference(Map<Integer, String> preference) {
		this.preference = preference;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + ", phone=" + phone + ", age=" + age
				+ ", course=" + Arrays.toString(course) + ", skills=" + skills + ", marks=" + marks + ", preference="
				+ preference + "]";
	}

}
