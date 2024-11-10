package com.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import com.connection.jdbconnection;
import com.model.Borrow;

public class BorrowdaoImp implements Borrowdao {

	@Override
	public String borrowbook(int userid,int bookid,int quantity,String issuedate,String duedate) throws SQLException {

		Connection con = jdbconnection.provideConnection();
		PreparedStatement ps = con.prepareStatement("INSERT INTO borrow (userid,bookid,quantity,issuedate,duedate) VALUES (?,?,?,?,?)");
		
		ps.setInt(1, userid);
		ps.setInt(2, bookid);
		ps.setInt(3, quantity);
		ps.setString(4, issuedate);
		ps.setString(5, duedate);
		int result = ps.executeUpdate();
		
		if(result > 0) {
			return "data inserted";
		}
		return "data not inserted";
	}

	@Override
	public Borrow returnBook(int borrowid,String returndate) throws SQLException {
		
		 try {
     		Connection con = jdbconnection.provideConnection();
         
         String transactionQuery = "SELECT  * FROM borrow WHERE  borrowid = ?";
         PreparedStatement transactionStmt = con.prepareStatement(transactionQuery);
         transactionStmt.setInt(1, borrowid);


         ResultSet resultSet = transactionStmt.executeQuery();

         if (resultSet.next()) {
             int borrowid1= resultSet.getInt("borrowid");
             LocalDate duedate = resultSet.getDate("duedate").toLocalDate();

             LocalDate returndate1 =  LocalDate.parse(returndate);
             int  daysOverdue = (int) ChronoUnit.DAYS.between(duedate, returndate1);
             int fineamount =  daysOverdue >  0 ?  daysOverdue * 20 : 0;
             int totalcost = (int) fineamount;


             String updateTransactionQuery = "UPDATE borrow SET returndate = ?, fineamount = ?, totalcost = ? WHERE borrowid = ?";
             PreparedStatement updateTransactionStmt = con.prepareStatement(updateTransactionQuery);
             updateTransactionStmt.setDate(1, Date.valueOf(returndate));
             updateTransactionStmt.setDouble(2, fineamount);
             updateTransactionStmt.setDouble(3, totalcost);
             updateTransactionStmt.setInt(4, borrowid);

             updateTransactionStmt.executeUpdate();
             System.out.println("Days overdue: " + daysOverdue);
             System.out.println("Fine amount: $" + fineamount);
             System.out.println("Total cost: $" + totalcost);

         }

     } catch (SQLException e) {
          e.printStackTrace();
     }
		return null;
	}

	@Override
	public Borrow deleteborrowbook(int borrowid) throws SQLException {
		
		Connection con = jdbconnection.provideConnection() ;
		PreparedStatement ps1 = con.prepareStatement("SELECT * FROM borrow WHERE borrowid = ?");
		ps1.setInt(1, borrowid);
		ResultSet resultset = ps1.executeQuery();
		if(resultset.next()) {
		int borrowid1 = resultset.getInt("borrowid");
		int userid = resultset.getInt("userid");
		int bookid = resultset.getInt("bookid");
		int quantity = resultset.getInt("quantity");
		String issuedate = resultset.getString("issuedate");
		String duedate = resultset.getString("duedate");
		String returndate = resultset.getString("returndate");
		int fineamount = resultset.getInt("fineamount");
		int totalcost = resultset.getInt("totalcost");
		boolean paidstatus = resultset.getBoolean("paidstatus");
		
		Borrow br = new Borrow(borrowid1, userid, bookid, quantity, issuedate, duedate, returndate,fineamount, totalcost);
		
		PreparedStatement ps = con.prepareStatement("DELETE FROM borrow WHERE borrowid =?");
		ps.setInt(1, borrowid);
		int result =ps.executeUpdate();
		if(result >0) {
			return br;
		}
		
		}
		return null;
	}

	@Override
	public Borrow ViewBorrowTransactions() throws SQLException {


		Connection con = jdbconnection.provideConnection() ;
		PreparedStatement ps1 = con.prepareStatement("SELECT * FROM borrow ");
		ResultSet resultset = ps1.executeQuery();
		while(resultset.next()) {
		int borrowid = resultset.getInt("borrowid");
		int userid = resultset.getInt("userid");
		int bookid = resultset.getInt("bookid");
		int quantity = resultset.getInt("quantity");
		String issuedate = resultset.getString("issuedate");
		String duedate = resultset.getString("duedate");
		String returndate = resultset.getString("returndate");
		int fineamount = resultset.getInt("fineamount");
		int totalcost = resultset.getInt("totalcost");

		System.out.println("borrowid= "+borrowid+",bookid= "+bookid+","+"userid= "+userid+","+"issuedate= "+issuedate+","+"returndate= "+returndate+","+"fineamount="+fineamount+",totalcost= "+totalcost);

		}
		return null;
	}


	 
}
