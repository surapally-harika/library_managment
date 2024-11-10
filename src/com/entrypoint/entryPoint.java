package com.entrypoint;

import java.util.Scanner;

import com.utility.Addbook;
import com.utility.AddborrowBook;
import com.utility.Addlibrarian;
import com.utility.Adduser;
import com.utility.Updatebook;
import com.utility.login;
import com.utility.returnBook;
import com.utility.searchBook;
import com.utility.userTransaction;
import com.utility.viewBooks;
import com.utility.viewBorrowTransactions;

public class entryPoint {

	 public static void main(String[] args) {
	        boolean flag = true;
	        Scanner sc = new Scanner(System.in);

	        while (flag) {
	            System.out.println("Welcome to library management system");
	            System.out.println("1. User\n2. Librarian\n3. Exit");
	            int n = sc.nextInt();

	            switch (n) {
	                case 1:
	                    handleUser(sc);
	                    break;
	                    
	                case 2:
	                    handleLibrarian(sc);
	                    break;
	                    
	                case 3:
	                    flag = false;
	                    System.out.println("Exiting library management system.");
	                    break;
	                    
	                default:
	                    System.out.println("Invalid choice.");
	                    break;
	            }
	        }
	        sc.close();
	    }

	    private static void handleUser(Scanner sc) {
	        System.out.println("1. Register\n2. Login");
	        int choice = sc.nextInt();

	        if (choice == 1) {
	            Adduser addUser = new Adduser();
	            addUser.add(sc); 
	        } else if (choice == 2) {
	            login login = new login();
	            if (login.loginUser(sc)) { 
	                userMenu(sc);
	            } else {
	                System.out.println("Login failed. Try again.");
	            }
	        } else {
	            System.out.println("Invalid choice.");
	        }
	    }

	    private static void userMenu(Scanner sc) {
	        boolean userFlag = true;

	        while (userFlag) {
	            System.out.println("1. View all books.");
	            System.out.println("2. Search book.");
	            System.out.println("3. Borrow book.");
	            System.out.println("4. Return book.");
	            System.out.println("5. View borrowed books.");
	            System.out.println("6. Back to menu.");
	            System.out.println("7. Exit");

	            int num1 = sc.nextInt();
	            switch (num1) {
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
	                    returnBook rb = new returnBook();
	                    rb.returnbook(sc);
	                    break;
	                case 5:
	                    userTransaction uts = new userTransaction();
	                    uts.userTransaction(sc);
	                    break;
	                case 6:
	                    userFlag = false;
	                    break;
	                case 7:
	                    System.out.println("Exited from user successfully!");
	                    userFlag = false;
	                    break;
	                default:
	                    System.out.println("Invalid choice.");
	                    break;
	            }
	        }
	    }

	    private static void handleLibrarian(Scanner sc) {
	    	
	    	System.out.println("1. Register\n2. Login");
	        int choice = sc.nextInt();

	        if (choice == 1) {
	            Addlibrarian al = new Addlibrarian();
	            al.addlibrarian(sc); 
	        } else if (choice == 2) {
	            login login = new login();
	            if (login.loginLibrarian(sc)) { 
	                userMenu(sc);
	            } else {
	                System.out.println("Login failed. Try again.");
	            }
	        } else {
	            System.out.println("Invalid choice.");
	        }
	    }
	    	
	 
	    private static void librarianMenu(Scanner sc) {
	        boolean librarianFlag = true;

	        while (librarianFlag) {
	            System.out.println("1. View all books.");
	            System.out.println("2. Add book.");
	            System.out.println("3. Update book.");
	            System.out.println("4. View borrow transactions.");
	            System.out.println("5. Add borrow book.");
	            System.out.println("6. View user transactions.");
	            System.out.println("7. Back to menu.");
	            System.out.println("8. Exit");

	            int num2 = sc.nextInt();
	            switch (num2) {
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
	                    librarianFlag = false;
	                    break;
	                case 8:
	                    System.out.println("Exited from librarian successfully!");
	                    librarianFlag = false;
	                    break;
	                default:
	                    System.out.println("Invalid choice.");
	                    break;
	            }
	        }
	    }

}
