package com.utility;

import java.sql.SQLException;
import java.util.Scanner;
import com.dao.Bookdao;
import com.dao.BookdaoImp;
import com.model.book;
import com.model.librarian;

public class Addbook {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the title:");
		String title = sc.nextLine();
		System.out.println("enter the author:");
		String author = sc.nextLine();
		System.out.println("enter the genre:");
		String genre = sc.nextLine();
		System.out.println("enter the cost:");
		int cost = sc.nextInt();
		System.out.println("enter the copiesAvailable:");
		int copiesAvailable = sc.nextInt();
		
		book b = new book(title,author,genre,cost,copiesAvailable);
		
		Bookdao bdao = new BookdaoImp();
		
		try {
			String result = bdao.addbook(b);
			System.out.println("book added successfully!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
