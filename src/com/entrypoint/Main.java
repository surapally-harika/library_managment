package com.entrypoint;

import java.util.Scanner;

import com.utility.Addbook;
import com.utility.Addlibrarian;
import com.utility.Adduser;
import com.utility.BorrowBook;
import com.utility.Updatebook;
import com.utility.returnBook;
import com.utility.AddborrowBook;
import com.utility.searchBook;
import com.utility.userTransaction;
import com.utility.viewBooks;
import com.utility.viewBorrowTransactions;


public class Main {
	
	
	public static void main(String[] args) {
		
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		
		while(flag) {
		System.out.println("Welcome to library management system");
		
		System.out.println("1.User\n2.Librarian\n3.exit");
		
		int n = sc.nextInt();
		
		switch(n) {
		case 1:
			if(n == 1) {
				
				Adduser au = new Adduser();
				au.add(sc);
				
				
			}
			boolean user = true;
			while(user) {
			System.out.println("1.view all books.");
			System.out.println("2.search book.");
			System.out.println("3.borrow book.");
			System.out.println("4.retrun book.");
			System.out.println("5.view borrowed books");
			System.out.println("6.back to menu.");
			System.out.println("7.exit");
			
			int num1 = sc.nextInt();
			switch(num1) {
			case 1:
				viewBooks vb = new viewBooks();
				vb.ViewBooks(sc);
				break;
			case 2:
				searchBook sb = new searchBook();
				sb.searchBook(sc);
				break;
			case 3:
				AddborrowBook bb = new AddborrowBook();
				bb.borrowbook(sc);
				break;
			case 4:
				returnBook ub = new returnBook();
				ub.returnbook(sc);
				break;
			case 5:
				userTransaction uts = new userTransaction();
				uts.userTransaction(sc);
				break;
			case 6:
				user = false;
				break;
			case 7:
				System.out.println("Exit from user successfully!");
				break;
				
			}
		}
			break;
			
		case 2:
			if(n == 2) {
				Addlibrarian lb = new Addlibrarian();
				lb.addlibrarian(sc);
			}
			boolean librarian = true;
			while(librarian) {
			System.out.println("1.view all books.");
			System.out.println("2.add book.");
			System.out.println("3.update book.");
			System.out.println("4.view borrow books.");
			System.out.println("5.add borrow book.");
			System.out.println("6.view user transaction.");
			System.out.println("7.back to menu.");
			System.out.println("8.exit");
			int num2 = sc.nextInt() ;
			switch(num2) {
			case 1:
				viewBooks vb = new viewBooks();
				vb.ViewBooks(sc);
				break;
			case 2:
				Addbook ab = new Addbook();
				ab.add(sc);
				
				break;
			case 3:
				Updatebook ub = new Updatebook();
				ub.updateBook(sc);
				break;
				
			case 4:
				viewBorrowTransactions vbt = new viewBorrowTransactions();
				vbt.ViewBorrowTransaction(sc);
				break;
			case 5:
				AddborrowBook abb = new AddborrowBook();
				abb.borrowbook(sc);
				break;
			case 6:
				userTransaction ut = new userTransaction();
				ut.userTransaction(sc);
				break;
			case 7:
				librarian =false;
				break;
			case 8:
				System.out.println("Exit from librarian successfully!");
				break;
				}
				
			}
			break;
		case 3:
			boolean exit = false;
			System.out.println("Exit from library management system.");
			break;
		
		default :
			System.out.print("invalid choice.");
			break;
			}
	
		}
	}

}
