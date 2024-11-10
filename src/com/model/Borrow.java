package com.model;

import java.time.LocalDate;

public class Borrow {
	private int borrowid;
	private int userid;
	private int bookid;
	private int quantity;
	private String issudate;
	private String duedate;
	private String returndate;
	private int fineamount;
	private int totalcost;
	
	public Borrow() {
		
	}

	public Borrow(int borrowid, int userid, int bookid, int quantity, String issudate, String duedate,
			String returndate, int fineamount, int totalcost) {
		super();
		this.borrowid = borrowid;
		this.userid = userid;
		this.bookid = bookid;
		this.quantity = quantity;
		this.issudate = issudate;
		this.duedate = duedate;
		this.returndate = returndate;
		this.fineamount = fineamount;
		this.totalcost = totalcost;

	}
	
	

	public Borrow(int userid, int bookid, int quantity, String issudate, String duedate, String returndate,
			int fineamount, int totalcost) {
		super();
		this.userid = userid;
		this.bookid = bookid;
		this.quantity = quantity;
		this.issudate = issudate;
		this.duedate = duedate;
		this.returndate = returndate;
		this.fineamount = fineamount;
		this.totalcost = totalcost;

	}

	
	public Borrow(int userid, int bookid, int quantity, String issudate, String duedate) {
		super();
		this.userid = userid;
		this.bookid = bookid;
		this.quantity = quantity;
		this.issudate = issudate;
		this.duedate = duedate;
	}
	
	

	public Borrow(int borrowid, String duedate, String returndate, int fineamount, int totalcost) {
		super();
		this.borrowid = borrowid;
		this.duedate = duedate;
		this.returndate = returndate;
		this.fineamount = fineamount;
		this.totalcost = totalcost;
	}

	public int getBorrowid() {
		return borrowid;
	}

	public void setBorrowid(int borrowid) {
		this.borrowid = borrowid;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getIssudate() {
		return issudate;
	}

	public void setIssudate(String issudate) {
		this.issudate = issudate;
	}

	public String getDuedate() {
		return duedate;
	}

	public void setDuedate(String duedate) {
		this.duedate = duedate;
	}

	public String getReturndate() {
		return returndate;
	}

	public void setReturndate(String returndate) {
		this.returndate = returndate;
	}

	public int getFineamount() {
		return fineamount;
	}

	public void setFineamount(int fineamount) {
		this.fineamount = fineamount;
	}

	public int getTotalcost() {
		return totalcost;
	}

	public void setTotalcost(int totalcost) {
		this.totalcost = totalcost;
	}


	

	@Override
	public String toString() {
		return "Borrow [borrowid=" + borrowid + ", userid=" + userid + ", bookid=" + bookid + ", quantity=" + quantity
				+ ", issudate=" + issudate + ", duedate=" + duedate + ", returndate=" + returndate + ", fineamount="
				+ fineamount + ", totalcost=" + totalcost + "]";
	}

	

	
	

}
