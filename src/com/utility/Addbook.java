package com.utility;

import java.sql.SQLException;
import java.util.Scanner;
import com.dao.Bookdao;
import com.dao.BookdaoImp;
import com.model.Book;
import com.model.librarian;

public class Addbook {

	public static void add(Scanner sc) {

		
		System.out.println("enter the title:");
		String title = sc.next();
		
		sc.nextLine();
		System.out.println("enter the author:");
		String author = sc.nextLine();
		
		System.out.println("enter the genre:");
		String genre = sc.nextLine();
	
		System.out.println("enter the copiesAvailable:");
		int copiesAvailable = sc.nextInt();
		
		Book b = new Book(title,author,genre,copiesAvailable);
		
		Bookdao bdao = new BookdaoImp();
		
		try {
			Book result = bdao.addbook(b);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
