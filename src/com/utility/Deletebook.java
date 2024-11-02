package com.utility;

import java.sql.SQLException;
import java.util.Scanner;

import com.dao.Bookdao;
import com.dao.BookdaoImp;
import com.model.book;

public class Deletebook {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  the bookid");
		int bookid = sc.nextInt();
		
		Bookdao bdao = new BookdaoImp();
		
		try {
			book book = bdao.deletebook(bookid);
			System.out.println("book is deleted successfully!");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		

	}

}
