package com.utility;

import java.sql.SQLException;
import java.util.Scanner;

import com.dao.Borrowdao;
import com.dao.BorrowdaoImp;
import com.model.Borrow;

public class viewBorrowTransactions {
	
	public static void ViewBorrowTransaction(Scanner sc) {

		System.out.println("View borrow Transactions ");
		
		Borrowdao bdao = new BorrowdaoImp();
		
		try {
			Borrow b = bdao.ViewBorrowTransactions();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
