package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.connection.jdbconnection;
import com.model.Book;
import com.model.librarian;

public class LibrariandaoImp implements Librariandao{

	@Override
	public String Addlibrarian(librarian lb) throws SQLException {
		Connection con = jdbconnection.provideConnection();
		PreparedStatement ps = con.prepareStatement("INSERT INTO librarian(lname,password) VALUES(?,?)");
		ps.setString(1, lb.getLname());
		ps.setString(2, lb.getPassword());
		int result = ps.executeUpdate();
		if(result > 0) {
			return "data inserted";
		}
		return "data not inserted";  
	}



}
