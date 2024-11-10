package com.utility;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.connection.jdbconnection;
import com.model.Borrow;

public class singleBookTransaction {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Single book borrow transaction");
		System.out.println("enter the bookid:");
		int bookid = sc.nextInt();
		
		try {
			singleBookTransaction( bookid);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}
	
	public static Borrow singleBookTransaction(int bookid) throws SQLException{
		
		Connection con = jdbconnection.provideConnection();
		PreparedStatement ps = con.prepareStatement("SELECT * FROM borrow WHERE bookid = ?");
		ps.setInt(1, bookid);
		ResultSet resultset = ps.executeQuery();
		while(resultset.next()) {
			int borrowid = resultset.getInt("borrowid");
			int bookid1 = resultset.getInt("bookid");
			int userid = resultset.getInt("userid");
			int quantity = resultset.getInt("quantity");
			String issuedate = resultset.getString("issuedate");
			String returndate = resultset.getString("returndate");
			int fineamount = resultset.getInt("fineamount");
			int totalcost = resultset.getInt("fineamount");
			System.out.println("borrowid= "+borrowid+",bookid= "+bookid+","+"userid= "+userid+","+"issuedate= "+issuedate+","+"returndate= "+returndate+","+"fineamount="+fineamount+","+"totalcost= "+totalcost);
		}
		return null;
		
	}
}
