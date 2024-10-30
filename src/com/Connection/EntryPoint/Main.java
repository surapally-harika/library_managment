package com.Connection.EntryPoint;

import java.sql.SQLException;
import java.util.Scanner;

import com.Connection.LibrarianDao.DataAccess;
import com.Connection.LibrarianDao.DataAccessImp;
import com.Connection.Model.User;


public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name:");
		String name = sc.nextLine();
		System.out.println("enter the password:");
		String password = sc.nextLine();
		System.out.println("enter the email:");
		String email = sc.nextLine();
		System.out.println("enter the gender:");
		
		DataAccess da = new DataAccessImp();
		
//		try {
			
//			String result = da.addUser(user);
//			System.out.println(result);
//		} catch (SQLException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
	}

}
