package com.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

import com.connection.jdbconnection;
import com.dao.Borrowdao;
import com.dao.BorrowdaoImp;
import com.model.Borrow;

public class AddborrowBook {

	public void borrowbook(Scanner sc) {
	
		System.out.println("Enter the user id:");
		int userid = sc.nextInt();
		
		System.out.println("Enter the bookid:");
		int bookid = sc.nextInt();
		System.out.println("Enter the Quantity:");
		int quantity = sc.nextInt();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		
		sc.nextLine();
		System.out.println("Enter the issuedate(yyyy-MM-dd):");
		String issuedate = sc.nextLine();
		LocalDate issuedate1 = LocalDate.parse(issuedate,formatter);
		
        System.out.print("Enter the due date (yyyy-MM-dd): ");
  		String duedate = sc.nextLine();
        LocalDate duedate1 = LocalDate.parse(duedate, formatter);
        
		
		Borrow br = new Borrow(userid, bookid, quantity, issuedate, duedate);
		
		Borrowdao  bdao = new BorrowdaoImp();
		
		try {
			String result = bdao.borrowbook(userid, bookid, quantity, issuedate, duedate);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	

}
