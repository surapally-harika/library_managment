package com.utility;

import java.sql.SQLException;
import java.util.Scanner;

import com.dao.Borrowdao;
import com.dao.BorrowdaoImp;
import com.model.Borrow;

public class DeleteBorrow {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the borrowid:");
		int borrowid = sc.nextInt();
		
		Borrowdao bdao = new BorrowdaoImp();
		
		try {
			Borrow br = bdao.deleteborrowbook(borrowid);
			System.out.println("data deleted Successfully!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
