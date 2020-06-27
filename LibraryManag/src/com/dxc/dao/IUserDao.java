package com.dxc.dao;

import java.util.List;
import com.dxc.pojos.Book;

public interface IUserDao {

	boolean passwordCheck(String name, String password);
	public void closeConnection();
	public List<Book> getBookList();
	public List<Book> getBookListOfParticularAuther(String autherName);
	void issueBook(int uId, int bId, int day,double balance);
	double getBalance(int userId);
	int getUserId(String name);
	void returnBook(int uId, int bId);
	List<Book> getIssuedBook(int uId);

}

