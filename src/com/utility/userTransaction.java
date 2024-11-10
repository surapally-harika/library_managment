package com.utility;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.connection.jdbconnection;
import com.model.Borrow;

public class userTransaction {

	public static void userTransaction(Scanner sc) {
	
		System.out.println("user transactions");
		System.out.println("Enter the userid:");
		int userid = sc.nextInt();
		
		try {
			userTransaction(userid);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static Borrow userTransaction(int uesrid) throws SQLException{
		
		Connection con = jdbconnection.provideConnection();
		PreparedStatement ps = con.prepareStatement("SELECT * FROM borrow WHERE userid = ?");
		ps.setInt(1, uesrid);
		ResultSet resultset = ps.executeQuery();
		while(resultset.next()) {
			int borrowid = resultset.getInt("borrowid");
			int bookid = resultset.getInt("bookid");
			int quantity = resultset.getInt("quantity");
			String issuedate = resultset.getString("issuedate");
			String returndate = resultset.getString("returndate");
			int fineamount = resultset.getInt("fineamount");
			int totalcost = resultset.getInt("fineamount");
			System.out.println("borrowid= "+borrowid+",bookid= "+bookid+","+"issuedate= "+issuedate+","+"returndate= "+returndate+","+"fineamount="+fineamount+","+"totalcost= "+totalcost);
		}
		return null;
	}
}
