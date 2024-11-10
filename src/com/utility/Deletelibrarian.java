package com.utility;

import java.sql.SQLException;
import java.util.Scanner;

import com.dao.Librariandao;
import com.dao.LibrariandaoImp;
import com.model.librarian;

public class Deletelibrarian {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the lid:");
		int lid = sc.nextInt();
		
		Librariandao ldao = new LibrariandaoImp() ;
//		
//		try {
////			librarian lb = ldao.Deletelibrarian(lid);
//			System.out.println("data deleted Successfully!");
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}

}
