package com.Connection.Model;

public class book {
	
	private int bookid;
	private String bookname;
	private String author;
	private String genre;
	private int cost;
	private int copiesAvailable;
	
	public book() {
		
	}

	public book(int bookid, String bookname, String author, String genre, int cost, int copiesAvailable) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.author = author;
		this.genre = genre;
		this.cost = cost;
		this.copiesAvailable = copiesAvailable;
	}

	public book(String bookname, String author, String genre, int cost, int copiesAvailable) {
		super();
		this.bookname = bookname;
		this.author = author;
		this.genre = genre;
		this.cost = cost;
		this.copiesAvailable = copiesAvailable;
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getCopiesAvailable() {
		return copiesAvailable;
	}

	public void setCopiesAvailable(int copiesAvailable) {
		this.copiesAvailable = copiesAvailable;
	}

	@Override
	public String toString() {
		return "book [bookid=" + bookid + ", bookname=" + bookname + ", author=" + author + ", genre=" + genre
				+ ", cost=" + cost + ", copiesAvailable=" + copiesAvailable + "]";
	}
	
	

}
