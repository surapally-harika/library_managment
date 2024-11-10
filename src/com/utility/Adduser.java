package com.utility;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.connection.jdbconnection;
import com.dao.Userdao;
import com.dao.UserdaoImp;
import com.model.User;

public class Adduser {
	
	public static void add(Scanner sc) {


	System.out.println("enter the name:");
	String name = sc.next();
	System.out.println("enter the password:");
	String password = sc.next();
	System.out.println("enter the email:");
	String email = sc.next();
	System.out.println("enter the gender:");
	String gender = sc.next();
	
	User us = new User(name,password,email,gender);
	
	Userdao da = new UserdaoImp();
	
	try {
		String result = da.addUser(us);
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
		
	}
//	public static boolean authenticateUser(String name, String password) {
//        boolean isAuthenticated = false;
//        
//        try  {
//        	
//        	Connection con = jdbconnection.provideConnection();
//        	String query = "SELECT * FROM user WHERE name = ? AND password = ?";
//            PreparedStatement preparedStatement = con.prepareStatement(query);
//            preparedStatement.setString(1, name);
//            preparedStatement.setString(2, password);
//
//            ResultSet resultSet = preparedStatement.executeQuery();
//
//            isAuthenticated = resultSet.next();
//
//        } catch (SQLException e) {
//            System.out.println("Database error: " + e.getMessage());
//        }
//
//        return isAuthenticated;
//	}
//	

}
