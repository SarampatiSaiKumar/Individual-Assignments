package com.book.model;


public class BookBean  {
	private int isbn;
	private String title;
	private String author;
	private int price;
	
	public BookBean( String title, String author, int price) {
		super();
		
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public BookBean() {
		// TODO Auto-generated constructor stub
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	

}
