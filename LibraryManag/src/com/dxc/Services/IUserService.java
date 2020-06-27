package com.dxc.Services;

import java.util.List;
import com.dxc.pojos.Book;

public interface IUserService {

	boolean PasswordCheck(String name, String password);

	public List<Book> getBookList();

	public List<Book> getBookListOfParticularAuther(String autherName);

	public void issueBook(int uId, int bId, int day,double balance);

	public double getBalance(int userId);

	public void closeConnection();

	public int getUserId(String name);

	void returnBook(int uId, int bId);

	List<Book> getIssuedBook(int uId);

}

