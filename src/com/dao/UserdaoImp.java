package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.connection.jdbconnection;
import com.model.User;
import com.model.Book;


public class UserdaoImp implements Userdao{

	@Override
	public String addUser(User user) throws SQLException {
		Connection con = jdbconnection.provideConnection();
		PreparedStatement ps = con.prepareStatement("INSERT INTO user(name,password,email,gender) VALUES(?,?,?,?)");
		ps.setString(1, user.getName());
		ps.setString(2, user.getPassword());
		ps.setString(3, user.getEmail());
		ps.setString(4, user.getGender());
		
		int result = ps.executeUpdate();
		
		if(result > 0) {
			
			return "data inserted";
		}
		
		return "data not inserted";
	}

				

}

