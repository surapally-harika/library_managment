package com.utility;

import java.sql.SQLException;
import java.util.Scanner;

import com.dao.Borrowdao;
import com.dao.BorrowdaoImp;
import com.model.Borrow;

public class AddborrowBook {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the user id:");
		int userid = sc.nextInt();
		System.out.println("Enter the book id:");
		int bookid = sc.nextInt();
		System.out.println("Enter the librarian id:");
		int lid = sc.nextInt();
		System.out.println("Enter the Quantity:");
		int quantity = sc.nextInt();
		System.out.println("Enter the issuedate:");
		String issudate = sc.nextLine();
		System.out.println("Enter the overdate:");
		String overdate = sc.nextLine();
		System.out.println("Enter the fine amount:");
		int fineamount = sc.nextInt();
		System.out.println("Enter the total amount:");
		int totalcost = sc.nextInt();
		System.out.println(" is he/she paid amount:");
		boolean paidstatus = sc.nextBoolean();
		
		Borrow br = new Borrow(userid,bookid,lid,quantity,issudate,overdate,fineamount,totalcost,paidstatus);
		
		Borrowdao  bdao = new BorrowdaoImp();
		
		try {
			String result = bdao.borrow(br);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
