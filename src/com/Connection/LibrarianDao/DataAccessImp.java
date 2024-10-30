package com.Connection.LibrarianDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.Connection.jdbconnection;
import com.Connection.Model.User;


public class DataAccessImp {
	
	public String add(User u) throws SQLException{
		Connection con = jdbconnection.provideConnection();
		PreparedStatement ps = con.prepareStatement("INSERT INTO user(name,password,email,gender) VALUES(?,?,?,?)");
		ps.setString(1, u.getUname());
		ps.setString(2, u.getPassword());
		ps.setString(3, u.getEmail());
		ps.setString(4, u.getGender());
		int result = ps.executeUpdate();
		if(result > 0) {
			return "data inserted";
		}
		
		return "data not inserted";
		
	}

}
