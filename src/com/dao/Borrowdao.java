	package com.dao;

import java.sql.SQLException;

import com.model.Borrow;

public interface Borrowdao {
	
	
	public String borrowbook(int userid,int bookid,int quantity,String issuedate,String duedate) throws SQLException;
	
	public Borrow returnBook(int borrowid,String reutndate) throws SQLException;
	
	public Borrow deleteborrowbook(int borrowid ) throws SQLException;
	
	public Borrow ViewBorrowTransactions() throws SQLException;
	

}
