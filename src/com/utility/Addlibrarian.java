package com.utility;

import java.sql.SQLException;
import java.util.Scanner;
import com.dao.Librariandao;
import com.dao.LibrariandaoImp;
import com.model.librarian;

public class Addlibrarian {

	public static void addlibrarian(Scanner sc) {

		
		System.out.println("enter the name:");
		String name = sc.next();
		System.out.println("enter the password:");
		String password = sc.next();
		
		
		librarian lb = new librarian(name,password);
		
		Librariandao lbdao = new LibrariandaoImp();
		
		try {
			String result = lbdao.Addlibrarian(lb);
			System.out.println("data added successfully!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
