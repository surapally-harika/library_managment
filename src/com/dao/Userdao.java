package com.dao;

import java.sql.SQLException;

import com.model.User;

public interface Userdao {
	
	public String addUser(User user) throws SQLException;
	
	public User UpdateUser(int userid,String password) throws SQLException;
	
	public User DeleteUser(int userid) throws SQLException;
	
}
