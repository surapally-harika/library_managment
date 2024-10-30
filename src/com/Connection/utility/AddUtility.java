package com.Connection.utility;

import java.sql.SQLException;
import java.util.Scanner;

import com.Connection.LibrarianDao.DataAccess;
import com.Connection.LibrarianDao.DataAccessImp;
import com.Connection.Model.User;

public class AddUtility {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the name:");
	String uname = sc.nextLine();
	System.out.println("enter the password:");
	String password = sc.nextLine();
	System.out.println("enter the email:");
	String email = sc.nextLine();
	System.out.println("enter the gender:");
	String gender = sc.nextLine();
	
	User us = new User(uname,password,email,gender);
	
	DataAccess da = new DataAccessImp();
	
	try {
		String result = da.addUser(us);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
		
	}
	

}
