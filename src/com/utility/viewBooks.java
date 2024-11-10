package com.utility;

import java.sql.SQLException;
import java.util.Scanner;

import com.dao.Bookdao;
import com.dao.BookdaoImp;
import com.model.Book;

public class viewBooks {
	
	public  void ViewBooks(Scanner sc) {
		
		System.out.println("BOOK DEATILS:");
		
		Bookdao bdao = new BookdaoImp();
		
		try {
			Book book = bdao.viewbooks();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
