package com.model;

public class librarian {
	
	private int lid;
	private String lname;
	private String password;
	
	public librarian() {
		
	}

	public librarian(int lid, String lname, String password) {
		super();
		this.lid = lid;
		this.lname = lname;
		this.password = password;
	}

	public librarian(String lname, String password) {
		super();
		this.lname = lname;
		this.password = password;
	}

	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "librarian [lid=" + lid + ", lname=" + lname + ", password=" + password + "]";
	}
	
	
	
	
}
