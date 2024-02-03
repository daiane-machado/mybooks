package com.learning.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "books")
public class Book {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "author")
	private String author;
	
	@Column(name = "publication_year")
	private int publicationYear;
	
	@Column(name = "genre")
	private String genre;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "language")
	private String language;
	
	@Column(name = "num_pages")
	private int numPages;
	
	public Book() {
		
	}
	
	public Book(String title, String author, int publicationYear, String genre,
			String description, String language, int numPages) {
		super();
		this.title = title;
		this.author = author;
		this.publicationYear = publicationYear;
		this.genre = genre;
		this.description = description;
		this.numPages = numPages;
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public int getPublicationYear() {
		return publicationYear;
	}
	
	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}
	
	public String getGenre() {
		return genre;
	}
	
	
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public int getNumPages() {
		return numPages;
	}
	
	public void setnumPages(int numPages) {
		this.numPages = numPages;
	}
}
