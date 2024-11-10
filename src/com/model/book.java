package com.model;

public class Book {
	
	private int bookid;
	private String title;
	private String author;
	private String genre;
	private int copiesAvailable;
	
	public Book() {
		
	}

	public Book(int bookid, String title, String author, String genre, int copiesAvailable) {
		super();
		this.bookid = bookid;
		this.title = title;
		this.author = author;
		this.genre = genre;
	
		this.copiesAvailable = copiesAvailable;
	}

	
	public Book(String title) {
		super();
		this.title = title;
	}

	public Book(String title, String author, String genre, int copiesAvailable) {
		super();
		this.title = title;
		this.author = author;
		this.genre = genre;
		
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

	public int getCopiesAvailable() {
		return copiesAvailable;
	}

	public void setCopiesAvailable(int copiesAvailable) {
		this.copiesAvailable = copiesAvailable;
	}

	@Override
	public String toString() {
		return "book [bookid=" + bookid + ", title=" + title + ", author=" + author + ", genre=" + genre +  ", copiesAvailable=" + copiesAvailable + "]";
	}
	
//	public Book findBookByTitle(String title) {
//        for (Book book : Book) {
//            if (book.getTitle().equalsIgnoreCase(title)) {
//                return book;
//            }
//        }
//        return null;  // Return null if book is not found
//    }
	
}