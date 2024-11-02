package com.dao;

import com.model.book;
import java.sql.SQLException;

public interface Bookdao {
		
	public String addbook(book book) throws SQLException;
	
	public book updatebook(int bookid,String title,String author,String genre,int cost,int copiesAvailable)throws SQLException;
	
	public book deletebook(int bookid) throws SQLException;
}
