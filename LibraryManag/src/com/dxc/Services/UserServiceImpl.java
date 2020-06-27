package com.dxc.Services;

import java.util.List;

import com.dxc.dao.UserDaoImpl;
import com.dxc.dao.IUserDao;
import com.dxc.pojos.Book;
import com.dxc.Services.IUserService;

public class UserServiceImpl implements IUserService {

	IUserDao dao=new UserDaoImpl();
	@Override
	public boolean PasswordCheck(String name, String password) {
		return dao.passwordCheck(name,password);
	}
	@Override
	public List<Book> getBookList() {
		return dao.getBookList();
	}
	@Override
	public List<Book> getBookListOfParticularAuther(String autherName) {
		return dao.getBookListOfParticularAuther(autherName);
	}
	@Override
	public void issueBook(int uId, int bId, int day,double balance) {

		dao.issueBook(uId,bId,day,balance);
	}
	@Override
	public double getBalance(int userId) {
		return dao.getBalance(userId);
	}
	@Override
	public void closeConnection() {
		dao.closeConnection();
	}
	@Override
	public int getUserId(String name) {
		return dao.getUserId(name);
	}
	@Override
	public void returnBook(int uId, int bId) {
		dao.returnBook(uId,bId);
	}
	@Override
	public List<Book> getIssuedBook(int uId) {
		return dao.getIssuedBook(uId);
	}
}
