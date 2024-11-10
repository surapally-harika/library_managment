package com.utility;

import java.sql.SQLException;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import com.dao.Borrowdao;
import com.dao.BorrowdaoImp;
import com.model.Borrow;

public class returnBook {


	public static void returnbook(Scanner sc) {


		
		System.out.println("Enter the borrow id:");
		int borrowid = sc.nextInt();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
       
        System.out.print("Enter the return date (yyyy-MM-dd): ");
        String returndate = sc.next();
        sc.nextLine();
        
        
        Borrowdao bdao = new BorrowdaoImp();
        
        try {
			Borrow br = bdao.returnBook(borrowid,returndate);
			System.out.println("book return successfully!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}
		

}
