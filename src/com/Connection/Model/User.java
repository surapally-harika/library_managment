package com.Connection.Model;

public class User {
	
	private int uid;
	private String uname;
	private String password;
	private String email;
	private String gender;
	
	public User() {
		
	}

	public User(int uid, String uname, String password, String email, String gender) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.password = password;
		this.email = email;
		this.gender = gender;
	}

	public User(String uname, String password, String email, String gender) {
		super();
		this.uname = uname;
		this.password = password;
		this.email = email;
		this.gender = gender;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", password=" + password + ", email=" + email + ", gender="
				+ gender + "]";
	}
	
	

}
