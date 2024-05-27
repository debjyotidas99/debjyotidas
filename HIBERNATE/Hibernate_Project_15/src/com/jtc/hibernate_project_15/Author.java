package com.jtc.hibernate_project_15;

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
import javax.persistence.ManyToMany;
import javax.persistence.MapKeyColumn;
import javax.persistence.Table;

@Entity
@Table(name = "author_Table")
public class Author {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "author_Id")
	private int author_Id;
	@Column(name = "author_Name")
	private String author_Name;
	@Column(name = "author_Email")
	private String author_Email;
	@Column(name = "author_phone")
	private long author_Phone;

	@ElementCollection
	@CollectionTable(name = "qualification_Table", joinColumns = @JoinColumn(name = "authorId"))
	@Column(name = "qualification")
	private List<String> qualification;

	@ElementCollection
	@CollectionTable(name = "skill_Table", joinColumns = @JoinColumn(name = "author_Id"))
	@Column(name = "skill")
	private Set<String> skill;

	@ElementCollection
	@CollectionTable(name = "experience_Table", joinColumns = @JoinColumn(name = "author_Id"))
	@MapKeyColumn(name = "experience")
	@Column(name = "YearOfExp")
	private Map<String, Integer> experience;

	@ManyToMany(mappedBy = "author")
	private Set<Book> book;

	public Author(int author_Id, String author_Name, String author_Email, long author_Phone, List<String> qualification,
			Set<String> skill, Map<String, Integer> experience, Set<Book> book) {
		super();
		this.author_Id = author_Id;
		this.author_Name = author_Name;
		this.author_Email = author_Email;
		this.author_Phone = author_Phone;
		this.qualification = qualification;
		this.skill = skill;
		this.experience = experience;
		this.book = book;
	}

	public Author(String author_Name, String author_Email, long author_Phone, List<String> qualification,
			Set<String> skill, Map<String, Integer> experience, Set<Book> book) {
		super();
		this.author_Name = author_Name;
		this.author_Email = author_Email;
		this.author_Phone = author_Phone;
		this.qualification = qualification;
		this.skill = skill;
		this.experience = experience;
		this.book = book;
	}
	
	

	public Author(String author_Name, String author_Email, long author_Phone, List<String> qualification,
			Set<String> skill, Map<String, Integer> experience) {
		super();
		this.author_Name = author_Name;
		this.author_Email = author_Email;
		this.author_Phone = author_Phone;
		this.qualification = qualification;
		this.skill = skill;
		this.experience = experience;
	}

	public Author(String author_Name, String author_Email, long author_Phone) {
		super();
		this.author_Name = author_Name;
		this.author_Email = author_Email;
		this.author_Phone = author_Phone;
	}

	public int getAuthor_Id() {
		return author_Id;
	}

	public void setAuthor_Id(int author_Id) {
		this.author_Id = author_Id;
	}

	public String getAuthor_Name() {
		return author_Name;
	}

	public void setAuthor_Name(String author_Name) {
		this.author_Name = author_Name;
	}

	public String getAuthor_Email() {
		return author_Email;
	}

	public void setAuthor_Email(String author_Email) {
		this.author_Email = author_Email;
	}

	public long getAuthor_Phone() {
		return author_Phone;
	}

	public void setAuthor_Phone(long author_Phone) {
		this.author_Phone = author_Phone;
	}

	public List<String> getQualification() {
		return qualification;
	}

	public void setQualification(List<String> qualification) {
		this.qualification = qualification;
	}

	public Set<String> getSkill() {
		return skill;
	}

	public void setSkill(Set<String> skill) {
		this.skill = skill;
	}

	public Map<String, Integer> getExperience() {
		return experience;
	}

	public void setExperience(Map<String, Integer> experience) {
		this.experience = experience;
	}

	public Set<Book> getBook() {
		return book;
	}

	public void setBook(Set<Book> book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return "Author [author_Id=" + author_Id + ", author_Name=" + author_Name + ", author_Email=" + author_Email
				+ ", author_Phone=" + author_Phone + ", qualification=" + qualification + ", skill=" + skill
				+ ", experience=" + experience + ", book=" + book + "]";
	}

}
