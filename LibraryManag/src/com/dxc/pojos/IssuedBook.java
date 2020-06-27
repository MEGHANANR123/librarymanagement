package com.dxc.pojos;

public class IssuedBook {

	private int userId;
	private int bookId;
	private int noOfDayTaken;
	private int noOfBookTaken;
	
	
	public IssuedBook() {
	}
	public IssuedBook(int userId, int bookId, int noOfDayTaken, int noOfBookTaken) {
		this.userId = userId;
		this.bookId = bookId;
		this.noOfDayTaken = noOfDayTaken;
		this.noOfBookTaken = noOfBookTaken;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public int getNoOfDayTaken() {
		return noOfDayTaken;
	}
	public void setNoOfDayTaken(int noOfDayTaken) {
		this.noOfDayTaken = noOfDayTaken;
	}
	public int getNoOfBookTaken() {
		return noOfBookTaken;
	}
	public void setNoOfBookTaken(int noOfBookTaken) {
		this.noOfBookTaken = noOfBookTaken;
	}
	
	
}
