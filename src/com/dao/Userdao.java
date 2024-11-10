package com.dao;

import java.sql.SQLException;

import com.model.User;
import com.model.Book;

public interface Userdao {
	
	public String addUser(User user) throws SQLException;
	

	
}
