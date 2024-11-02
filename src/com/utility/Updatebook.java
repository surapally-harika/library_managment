package com.utility;

import java.sql.SQLException;
import java.util.Scanner;

import com.dao.Bookdao;
import com.dao.BookdaoImp;
import com.model.book;

public class Updatebook {

	public static void main(String[] args) {


		Scanner sc = new Scanner (System.in);
		System.out.println("ENTER THE bookid:");
		int bookid = sc.nextInt();
		System.out.println("ENTER THE title:");
		String title = sc.next();
		System.out.println("ENTER THE author:");
		String author = sc.next();
		System.out.println("ENTER THE genre:");
		String genre = sc.next();
		
		System.out.println("ENTER THE cost:");
		int cost = sc.nextInt();
		System.out.println("ENTER THE copiesAvailable:");
		int copiesAvailable = sc.nextInt();
		
		Bookdao bdao = new BookdaoImp();
		
		try {
			book book = bdao.updatebook(bookid, title, author, genre, cost, copiesAvailable);
			System.out.println("book is updated successfully!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
