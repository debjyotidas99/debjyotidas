package com.jtc.hibernate_project_15;

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
@Table(name = "book_Table")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "book_Id")
	private int book_Id;
	@Column(name = "book_Name")
	private String book_Name;
	@Column(name = "book_Price")
	private int book_Price;
	@Column(name = "book_Publish")
	private int book_Publish;

	@ManyToMany
	@JoinTable(name = "author_Book", joinColumns = @JoinColumn(name = "book", referencedColumnName = "book_Id"), inverseJoinColumns = @JoinColumn(name = "author", referencedColumnName = "author_Id"))
	private Set<Author> author;

	public Book(int book_Id, String book_Name, int book_Price, int book_Publish, Set<Author> author) {
		super();
		this.book_Id = book_Id;
		this.book_Name = book_Name;
		this.book_Price = book_Price;
		this.book_Publish = book_Publish;
		this.author = author;
	}

	public Book(String book_Name, int book_Price, int book_Publish, Set<Author> author) {
		super();
		this.book_Name = book_Name;
		this.book_Price = book_Price;
		this.book_Publish = book_Publish;
		this.author = author;
	}

	public Book(String book_Name, int book_Price, int book_Publish) {
		super();
		this.book_Name = book_Name;
		this.book_Price = book_Price;
		this.book_Publish = book_Publish;
	}

	public int getBook_Id() {
		return book_Id;
	}

	public void setBook_Id(int book_Id) {
		this.book_Id = book_Id;
	}

	public String getBook_Name() {
		return book_Name;
	}

	public void setBook_Name(String book_Name) {
		this.book_Name = book_Name;
	}

	public int getBook_Price() {
		return book_Price;
	}

	public void setBook_Price(int book_Price) {
		this.book_Price = book_Price;
	}

	public int getBook_Publish() {
		return book_Publish;
	}

	public void setBook_Publish(int book_Publish) {
		this.book_Publish = book_Publish;
	}

	public Set<Author> getAuthor() {
		return author;
	}

	public void setAuthor(Set<Author> author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [book_Id=" + book_Id + ", book_Name=" + book_Name + ", book_Price=" + book_Price
				+ ", book_Publish=" + book_Publish + ", author=" + author + "]";
	}

}
