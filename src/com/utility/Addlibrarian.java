package com.utility;

import java.sql.SQLException;
import java.util.Scanner;
import com.dao.Librariandao;
import com.dao.LibrariandaoImp;
import com.model.librarian;

public class Addlibrarian {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name:");
		String name = sc.nextLine();
		System.out.println("enter the password:");
		String password = sc.nextLine();
		
		
		librarian lb = new librarian(name,password);
		
		Librariandao lbdao = new LibrariandaoImp();
		
		try {
			String result = lbdao.addLibrarianUtility(lb);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
