package com.utility;

import com.model.Book;
import java.sql.SQLException;
import java.util.Scanner;

import com.dao.Bookdao;
import com.dao.BookdaoImp;


public class searchBook {


	public void searchBook(Scanner sc) {
		

		System.out.println("Enter the title");
		String title = sc.next();

		Bookdao bdao = new BookdaoImp();
		
		try {
			Book book = bdao.searchbook(title);

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
