package com.utility;

import java.sql.SQLException;
import java.util.Scanner;

import com.dao.Bookdao;
import com.dao.BookdaoImp;
import com.model.Book;

public class Updatebook {

	
	public  void updateBook(Scanner sc) {


		System.out.println("enter the bookid:");
		int bookid = sc.nextInt();
		System.out.println("Enter the copiesAvailable:");
		int copiesAvailable = sc.nextInt();
		
		Bookdao bdao = new BookdaoImp();
		
		try {
			Book b = bdao.updatebook(bookid, copiesAvailable);
			System.out.println("book is updated successfully!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
