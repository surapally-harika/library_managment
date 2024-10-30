package com.Connection.LibrarianDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.Connection.jdbconnection;
import com.Connection.Model.User;


public class DataAccessImp implements DataAccess{

	@Override
	public String addUser(User us) throws SQLException {
		Connection con = jdbconnection.provideConnection();
		PreparedStatement ps = con.prepareStatement("INSERT INTO user(uname,password,email,gender) VALUES(?,?,?,?)");
		ps.setString(1, us.getUname());
		ps.setString(2, us.getPassword());
		ps.setString(3, us.getEmail());
		ps.setString(4, us.getGender());
		int result = ps.executeUpdate();
		if(result > 0) {
			return "data inserted";
		}
		
		return "data not inserted";
	}

}
