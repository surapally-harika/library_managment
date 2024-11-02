package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.connection.jdbconnection;
import com.model.librarian;

public class LibrariandaoImp implements Librariandao{

	@Override
	public String addLibrarianUtility(librarian lb) throws SQLException {

		Connection con = jdbconnection.provideConnection();
		PreparedStatement ps = con.prepareStatement("INSERT INTO librarian(lname,password) VALUES(?,?)");
		ps.setString(1, lb.getLname());
		ps.setString(2, lb.getPassword());
		int result = ps.executeUpdate();
		if(result > 0) {
			return " inserted data";
		}
		return "data not inserted";
	}

	@Override
	public librarian UpdateLibrarian(int lid,String lname,String passwprd) throws SQLException {

		Connection con = jdbconnection.provideConnection();
		PreparedStatement ps = con.prepareStatement("UPDATE librarian SET lname =?,password=? WHERE lid = ?" );
		ps.setInt(1, lid);
		ps.setString(2, passwprd);
		ps.setString(3, lname);
		int result = ps.executeUpdate();
		
		if(result > 0) {
			PreparedStatement ps1 = con.prepareStatement("SELECT* FROM librarian WHERE lid = ?");
			ps1.setInt(1, lid);
			ResultSet resultset = ps1.executeQuery();
			if(resultset.next()) {
			int lid1 = resultset.getInt("lid");
			String lname1= resultset.getString("lname");
			String password1 = resultset.getString("password");
			
			librarian lb = new librarian(lid1, lname1, password1);
			return lb;
			}else {
				return null;
			}
			
		}
		return null;
		
		
	}

	@Override
	public librarian Deletelibrarian(int lid) throws SQLException {
		
		Connection con = jdbconnection.provideConnection();
		PreparedStatement ps1 = con.prepareStatement("SELECT* FROM librarian WHERE lid = ?");
		ps1.setInt(1, lid);
		ResultSet resultset = ps1.executeQuery();
		
		if(resultset.next()) {
			int lid1 = resultset.getInt("lid");
			String lname1= resultset.getString("lname");
			String password1 = resultset.getString("password");
			
			librarian lb = new librarian(lid1, lname1, password1);
			
			PreparedStatement ps = con.prepareStatement("DELETE FROM librarian WHERE lid = ?");
			ps.setInt(1, lid);
			int result = ps.executeUpdate();
			if(result > 0) {
				return lb;
			}
		}
		
		return null;
	}

}
