package com.model;

public class book {
	
	private int bookid;
	private String title;
	private String author;
	private String genre;
	private int cost;
	private int copiesAvailable;
	
	public book() {
		
	}

	public book(int bookid, String title, String author, String genre, int cost, int copiesAvailable) {
		super();
		this.bookid = bookid;
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.cost = cost;
		this.copiesAvailable = copiesAvailable;
	}

	public book(String title, String author, String genre, int cost, int copiesAvailable) {
		super();
		this.title = title;
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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
		return "book [bookid=" + bookid + ", title=" + title + ", author=" + author + ", genre=" + genre + ", cost="
				+ cost + ", copiesAvailable=" + copiesAvailable + "]";
	}
	
	
	
}