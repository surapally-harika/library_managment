package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.connection.jdbconnection;
import com.model.Book;

public class BookdaoImp implements Bookdao{

	@Override
	public Book addbook(Book book) throws SQLException {
		Connection con = jdbconnection.provideConnection();
		PreparedStatement ps = con.prepareStatement("INSERT INTO book(title,author,genre,copiesAvailable) VALUES(?,?,?,?)");
		ps.setString(1, book.getTitle());
		ps.setString(2, book.getAuthor());
		ps.setString(3, book.getGenre());
		ps.setInt(4, book.getCopiesAvailable());
		
		int result = ps.executeUpdate();
		if(result > 0) {
			
			System.out.println("book added successfully!");
		}
		else {
			System.out.println("book  not added ");
		}
		return book;
		 
	}
	

	@Override
	public Book updatebook(int bookid,  int copiesAvailable)throws SQLException {


		Connection con = jdbconnection.provideConnection();
		PreparedStatement ps = con.prepareStatement("UPDATE book SET copiesAvailable = ? WHERE bookid = ?");
		ps.setInt(1, copiesAvailable);
		ps.setInt(2,bookid);
		
		int result = ps.executeUpdate();
		
		if(result > 0) {
			PreparedStatement ps1 = con.prepareStatement("SELECT * FROM book WHERE bookid = ?");
			ps1.setInt(1, bookid);
			ResultSet resultset = ps1.executeQuery();
			
			if(resultset.next()) {
				int bookid1 = resultset.getInt("bookid");
				String title = resultset.getString("title");
				String author = resultset.getString("author");
				String genre = resultset.getString("genre");
				int copiesAvailable1 = resultset.getInt("copiesAvailable");
				
				Book book = new Book(bookid1,title,author,genre,copiesAvailable1);
				return book;
			}else {
				return null;
			}
		}
		return null;
	}

	
	
	@Override
	public Book deletebook(int bookid) throws SQLException {
		
		Connection con = jdbconnection.provideConnection();
		PreparedStatement ps = con.prepareStatement("SELECT * FROM book WHERE bookid = ?");
		ps.setInt(1, bookid);
		ResultSet resultset = ps.executeQuery();
		
		if(resultset.next()) {
			int bookid1 = resultset.getInt("bookid");
			String title1 = resultset.getString("title");
			String author1 = resultset.getString("author");
			String genre1 = resultset.getString("genre");
	
			int copiesAvailable1 = resultset.getInt("copiesAvailable");
			
			Book book = new Book(bookid1,title1,author1,genre1,copiesAvailable1);
			
			PreparedStatement ps1 = con.prepareStatement("DELETE FROM book WHERE bookid = ?");
			ps1.setInt(1, bookid);
			int result = ps1.executeUpdate();
			if(result > 0) {
				return book;
			}
		}
		return null;
	}


	@Override
	public Book viewbooks() throws SQLException {
		
		Connection con = jdbconnection.provideConnection();
		PreparedStatement ps = con.prepareStatement("SELECT * FROM book");
		ResultSet resultset = ps.executeQuery();
		while(resultset.next()) {
		int bookid = resultset.getInt("bookid");
		String title = resultset.getString("title");
		String author = resultset.getString("author");
		String genre = resultset.getString("genre");
		int copiesAvailable = resultset.getInt("copiesAvailable");
		System.out.println("bookid= "+bookid+","+"title= "+title+","+"author= "+author+","+"genre= "+genre+","+"copiesAvailable="+copiesAvailable);
		
		}
	
		return null;
	}

	@Override
	public Book searchbook(String title) throws SQLException {
		
		Connection con = jdbconnection.provideConnection();
		PreparedStatement ps = con.prepareStatement("SELECT * FROM book WHERE title = ?");
		ps.setString(1, title);
		ResultSet resultset = ps.executeQuery();
		if(resultset.next()) {
			int bookid = resultset.getInt("bookid");
			String title1 = resultset.getString("title");
			String author = resultset.getString("author");
			String genre = resultset.getString("genre");
			int copiesAvailable = resultset.getInt("copiesAvailable");
			System.out.println("bookid= "+bookid+","+"title= "+title+","+"author= "+author+","+"genre= "+genre+","+"copiesAvailable="+copiesAvailable);
		}else {
			System.out.println("book not found.");
		}
		return null;
	}


}
