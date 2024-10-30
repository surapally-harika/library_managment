package com.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbconnection {

	public static Connection con;
	public static Connection provideConnection() {
		if(con == null) {
			try {
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_managment_system", "root", "root");
			} catch (SQLException e) {
			
				e.printStackTrace();
			}
		}
		return con;
		
	}
	
}
