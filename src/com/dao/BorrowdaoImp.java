package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.connection.jdbconnection;
import com.model.Borrow;

public class BorrowdaoImp implements Borrowdao {

	@Override
	public String borrow(Borrow br) throws SQLException {

		Connection con = jdbconnection.provideConnection();
		PreparedStatement ps = con.prepareStatement("INSERT INTO borrow (userid,bookid,lid,quantity,issuedate,overdate,fineamount,totalcost,paidstatus) VALUES (?,?,?,?,?,?,?,?,?)");
		ps.setInt(1, br.getBookid());
		ps.setInt(2, br.getUserid());
		ps.setInt(3, br.getLid());
		ps.setInt(4, br.getQuantity());
		ps.setString(5, br.getIssudate());
		ps.setString(6, br.getOverdate());
		ps.setInt(7, br.getFineamount());
		ps.setInt(8, br.getTotalcost());
		ps.setBoolean(9, br.isPaidstatus());
		int result = ps.executeUpdate();
		
		if(result > 0) {
			return "data inserted";
		}
		return "data not inserted";
	}
	 
}
