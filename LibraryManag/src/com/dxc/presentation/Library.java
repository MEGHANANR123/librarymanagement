package com.dxc.presentation;

import java.util.Scanner;

import com.dxc.Services.AdminServiceImpl;
import com.dxc.Services.UserServiceImpl;
import com.dxc.Services.IAdminService;
import com.dxc.Services.IUserService;

public class Library {
	
	public static void main(String[] args) {
		
		IAdminService ias=new AdminServiceImpl();
		IUserService ius=new UserServiceImpl();
		User user=new User();
		Admin admin=new Admin();
		
		
		while(true) {
			
			Scanner sc=new Scanner(System.in);
			System.out.println("1.Admin");
			System.out.println("2.User");
			System.out.println("\nChoose your choice...");
			int choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("Enter your name & password");
				String name=sc.next();
				String password=sc.next();
				boolean b1=ias.passwordCheck(name, password);
				if(b1==true)
				{
					System.out.println("\n"+name+" Successfully logined");
					admin.adminOperation();
				}else
					System.out.println("name & password incorrect\n");
				break;
				
				
			case 2:
				System.out.println("Enter your name & password");
				String name2=sc.next();
				boolean b2=ius.PasswordCheck(name2, sc.next());
				if(b2==true)
				{
					System.out.println("\nHi "+name2+"\n");
					user.userOperation(name2);
				}else
					System.out.println("name & password incorrect\n");
				break;
				
				
			default:
				System.out.println("Wrong!!! Enter Correct Choice...");
			}
		}
	}

}

