package com.utility;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.connection.jdbconnection;

public class login {

	public static boolean loginUser(Scanner sc) {


		
		System.out.println("enter the email:");
		String email = sc.next();
		
		System.out.println("enter the password:");
		String password = sc.next();
		
		if (authenticateUser(email, password)) {
            System.out.println("Login successful! " );
            
        } else {
            System.out.println("Invalid email or password. Please try again.");
        }
		
		
		return false;
		
		


	}
	
		public static boolean loginLibrarian(Scanner sc) {
		
		
				
				System.out.println("enter the name:");
				String lname = sc.next();
				
				System.out.println("enter the password:");
				String password = sc.next();
				
				if (authenticateLibrarian(lname, password)) {
		            System.out.println("Login successful! " );
		            
		            
		        } else {
		            System.out.println("Invalid email or password. Please try again.");
		        }
				return false;
		}
	
	   public static boolean authenticateUser(String email, String password) {
	        boolean isAuthenticated = false;
	        
	        try {
	        	
	        	Connection con = jdbconnection.provideConnection();
	        	String query = "SELECT * FROM user WHERE email = ? AND password = ?";
	            PreparedStatement preparedStatement = con.prepareStatement(query);
	            preparedStatement.setString(1, email);
	            preparedStatement.setString(2, password);

	            ResultSet resultSet = preparedStatement.executeQuery();

	            isAuthenticated = resultSet.next();

	        } catch (SQLException e) {
	            System.out.println("Database error: " + e.getMessage());
	        }

	        return isAuthenticated;
	   }
	   
	   
	   public static boolean authenticateLibrarian(String lname, String password) {
	        boolean isAuthenticated = false;
	        
	        try {
	        	
	        	Connection con = jdbconnection.provideConnection();
	        	String query = "SELECT * FROM librarian WHERE lname = ? AND password = ?";
	            PreparedStatement preparedStatement = con.prepareStatement(query);
	            preparedStatement.setString(1, lname);
	            preparedStatement.setString(2, password);

	            ResultSet resultSet = preparedStatement.executeQuery();

	            isAuthenticated = resultSet.next();

	        } catch (SQLException e) {
	            System.out.println("Database error: " + e.getMessage());
	        }

	        return isAuthenticated;
	   }

	   
}
