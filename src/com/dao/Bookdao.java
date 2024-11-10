package com.dao;

import com.model.Book;
import java.sql.SQLException;

public interface Bookdao {
		
	public Book addbook(Book book) throws SQLException;
	
	public Book updatebook(int bookid,int copiesAvailable)throws SQLException;
	
	public Book deletebook(int bookid) throws SQLException;
	
	public Book searchbook(String title) throws SQLException;
	
	public Book viewbooks()throws SQLException;
	

	
	
}
