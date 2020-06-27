package com.dxc.pojos;

public class Book {

	private int id;
	private String bookName;
	private String autherName;
	private int quantity;
	
	public Book() {
	}

	public Book(int id, String bookName, String autherName, int quantity) {
		this.id = id;
		this.bookName = bookName;
		this.autherName = autherName;
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAutherName() {
		return autherName;
	}

	public void setAutherName(String autherName) {
		this.autherName = autherName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public void display()
	{
		System.out.println(id+" "+bookName+" "+ autherName+" "+ quantity);
	}

	public void displayBook() {
		System.out.println("\n"+id+" "+bookName+" "+autherName+" \n");
	}
	
	
	
	
}
