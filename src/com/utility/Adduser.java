package com.utility;

import java.sql.SQLException;
import java.util.Scanner;

import com.dao.Userdao;
import com.dao.UserdaoImp;
import com.model.User;

public class Adduser {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the name:");
	String name = sc.nextLine();
	System.out.println("enter the password:");
	String password = sc.nextLine();
	System.out.println("enter the email:");
	String email = sc.nextLine();
	System.out.println("enter the gender:");
	String gender = sc.nextLine();
	
	User us = new User(name,password,email,gender);
	
	Userdao da = new UserdaoImp();
	
	try {
		String result = da.addUser(us);
		System.out.println("user added successfully!");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
		
	}
	

}
