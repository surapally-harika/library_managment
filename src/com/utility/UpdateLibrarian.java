package com.utility;

import java.sql.SQLException;
import java.util.Scanner;

import com.dao.Librariandao;
import com.dao.LibrariandaoImp;
import com.model.librarian;

public class UpdateLibrarian {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the lid:");
		int lid = sc.nextInt();
		System.out.println("Enter the lname:");
		String lname = sc.next();
		System.out.println("Enter the password:");
		String password = sc.nextLine();
		
		Librariandao ldao = new LibrariandaoImp();
		
		try {
			librarian lb = ldao.UpdateLibrarian(lid, lname, password);
			System.out.println("librarian updated successfully!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
