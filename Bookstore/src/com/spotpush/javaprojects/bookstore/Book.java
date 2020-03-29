package com.spotpush.javaprojects.bookstore;

/*
 * Book.java
 * Model class representing a book entity
 * @author www.spotpush.com
 */

public class Book {
	
	//class book declares protected variables id, title, author, price
	//protected variables are available to all classes within a package
	//and subclasses form other packages 
	protected int id;
	protected String title;
	protected String author;
	protected float price;
	
	public Book() {
	}
	
	public Book(int id) {
		this.id = id;
	}
	
	public Book(int id, String title, String author, float price) {
		this(title,author,price);
		this.id=id;
	}
	
	public Book(String title, String author, float price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	//getters - returns the value of the attribute 
	public int getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public float getPrice() {
		return price;
	}
	
	
	//setters - takes a parameter and assigns it to the attribute
	public void setId(int id) {
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
