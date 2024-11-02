package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.connection.jdbconnection;
import com.model.User;


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

				@Override
				public User UpdateUser(int userid, String password) throws SQLException {
			
					Connection con = jdbconnection.provideConnection();
					PreparedStatement ps = con.prepareStatement("UPDATE User SET password = ? WHERE userid = ?");
					ps.setInt(1, userid);
					ps.setString(2, password);
					int result = ps.executeUpdate();
					
					if(result > 0) {
						PreparedStatement ps1 = con.prepareStatement("SELECT * FROM user WHERE userid = ?");
						ps1.setInt(1, userid);
						ResultSet resultset = ps1.executeQuery();
						
						if(resultset.next()) {
							int userid1 = resultset.getInt("userid");
							String name = resultset.getString("name");
							String password1 = resultset.getString("password");
							String email = resultset.getString("email");
							String gender = resultset.getString("gender");
							
							User user = new User(name, password1, email, gender);
							return user;
						}else {
							return null;
						}
					}
					return null;
				}

					@Override
					public User DeleteUser(int userid) throws SQLException {
				
						Connection con = jdbconnection.provideConnection();
						PreparedStatement ps = con.prepareStatement("SELECT * FROM user WHERE userid = ?");
						ps.setInt(1, userid);
						ResultSet resultset = ps.executeQuery();
						
						if(resultset.next()) {
							int userid1 = resultset.getInt("userid");
							String name = resultset.getString("name");
							String password = resultset.getString("password");
							String email = resultset.getString("email");
							String gender = resultset.getString("gender");
							
							User user = new User(userid1,name, password, email, gender);
						
							PreparedStatement ps1= con.prepareStatement("DELETE FROM user WHERE userid = ?");
							ps1.setInt(1, userid);
							int result = ps1.executeUpdate();
							if(result > 0) {
								return user;
							}
						}
							
						return null;
					}

}

