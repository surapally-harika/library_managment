package com.Connection.LibrarianDao;

import java.sql.SQLException;

import com.Connection.Model.User;

public interface DataAccess {
	
	public String addUser(User user) throws SQLException;
	
}
