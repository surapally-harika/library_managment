package com.model;

public class Borrow {
	private int borrowid;
	private int userid;
	private int bookid;
	private int lid;
	private int quantity;
	private String issudate;
	private String overdate;
	private int fineamount;
	private int totalcost;
	private boolean paidstatus;
	
	public Borrow() {
		
	}

	public Borrow(int borrowid, int userid, int bookid, int lid, int quantity, String issudate, String overdate,int fineamount,
			int totalcost, boolean paidstatus) {
		super();
		this.borrowid = borrowid;
		this.userid = userid;
		this.bookid = bookid;
		this.lid = lid;
		this.quantity = quantity;
		this.issudate = issudate;
		this.overdate = overdate;
		this.fineamount = fineamount;
		this.totalcost = totalcost;
		this.paidstatus = paidstatus;
	}

	public Borrow(int userid, int bookid, int lid, int quantity, String issudate, String overdate, int fineamount, int totalcost,
			boolean paidstatus) {
		super();
		this.userid = userid;
		this.bookid = bookid;
		this.lid = lid;
		this.quantity = quantity;
		this.issudate = issudate;
		this.overdate = overdate;
		this.fineamount = fineamount;
		this.totalcost = totalcost;
		this.paidstatus = paidstatus;
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

	public int getFineamount() {
		return fineamount;
	}

	public void setFineamount(int fineamount) {
		this.fineamount = fineamount;
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
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

	public String getOverdate() {
		return overdate;
	}

	public void setOverdate(String overdate) {
		this.overdate = overdate;
	}

	public int getTotalcost() {
		return totalcost;
	}

	public void setTotalcost(int totalcost) {
		this.totalcost = totalcost;
	}

	public boolean isPaidstatus() {
		return paidstatus;
	}

	public void setPaidstatus(boolean paidstatus) {
		this.paidstatus = paidstatus;
	}

	@Override
	public String toString() {
		return "Borrow [borrowid=" + borrowid + ", userid=" + userid + ", bookid=" + bookid + ", lid=" + lid
				+ ", quantity=" + quantity + ", issudate=" + issudate + ", overdate=" + overdate + ", totalcost="
				+ totalcost + ", paidstatus=" + paidstatus + "]";
	}
	
	

}
