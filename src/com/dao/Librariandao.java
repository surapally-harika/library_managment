package com.dao;

import java.sql.SQLException;

import com.model.librarian;

public interface Librariandao {
	
	public String addLibrarianUtility(librarian lb) throws SQLException;
	
	public librarian UpdateLibrarian(int lid,String lname,String password) throws SQLException;
	 public librarian Deletelibrarian(int lid) throws SQLException;

}
