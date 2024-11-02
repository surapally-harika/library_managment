package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.connection.jdbconnection;
import com.model.book;

public class BookdaoImp implements Bookdao{

	@Override
	public String addbook(book book) throws SQLException {
		Connection con = jdbconnection.provideConnection();
		PreparedStatement ps = con.prepareStatement("INSERT INTO book(title,author,genre,cost,copiesAvailable) VALUES(?,?,?,?,?)");
		ps.setString(1, book.getTitle());
		ps.setString(2, book.getAuthor());
		ps.setString(3, book.getGenre());
		ps.setInt(4, book.getCost());
		ps.setInt(5, book.getCopiesAvailable());
		int result = ps.executeUpdate();
		if(result > 0) {
			return "data inserted";
		}
		return "data not inserted";  
	}
	

	@Override
	public book updatebook(int bookid, String title, String author, String genre, int cost, int copiesAvailable)throws SQLException {


		Connection con = jdbconnection.provideConnection();
		PreparedStatement ps = con.prepareStatement("UPDATE book SET title = ?,author = ?,genre = ?,cost = ?,copiesAvailable = ? WHERE bookid = ?");
		ps.setInt(1, copiesAvailable);
		ps.setInt(2,bookid);
		ps.setString(3, genre);
		ps.setString(4, title);
		ps.setString(5, author);
		ps.setInt(6, cost);
		int result = ps.executeUpdate();
		
		if(result > 0) {
			PreparedStatement ps1 = con.prepareStatement("SELECT * FROM book WHERE bookid = ?");
			ps1.setInt(1, bookid);
			ResultSet resultset = ps1.executeQuery();
			
			if(resultset.next()) {
				int bookid1 = resultset.getInt("bookid");
				String title1 = resultset.getString("title");
				String author1 = resultset.getString("author");
				String genre1 = resultset.getString("genre");
				int cost1 = resultset.getInt("cost");
				int copiesAvailable1 = resultset.getInt("copiesAvailabe");
				
				book book = new book(bookid1,title1,author1,genre1,cost1,copiesAvailable1);
				return book;
			}else {
				return null;
			}
		}
		return null;
	}

	
	
	@Override
	public book deletebook(int bookid) throws SQLException {
		
		Connection con = jdbconnection.provideConnection();
		PreparedStatement ps = con.prepareStatement("SELECT * FROM book WHERE bookid = ?");
		ps.setInt(1, bookid);
		ResultSet resultset = ps.executeQuery();
		
		if(resultset.next()) {
			int bookid1 = resultset.getInt("bookid");
			String title1 = resultset.getString("title");
			String author1 = resultset.getString("author");
			String genre1 = resultset.getString("genre");
			int cost1 = resultset.getInt("cost");
			int copiesAvailable1 = resultset.getInt("copiesAvailable");
			
			book book = new book(bookid1,title1,author1,genre1,cost1,copiesAvailable1);
			
			PreparedStatement ps1 = con.prepareStatement("DELETE FROM book WHERE bookid = ?");
			ps1.setInt(1, bookid);
			int result = ps1.executeUpdate();
			if(result > 0) {
				return book;
			}
		}
		return null;
	}

}
