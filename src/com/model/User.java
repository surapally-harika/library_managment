package com.model;

public class User {
	
	private int userid;
	private String name;
	private String password;
	private String email;
	private String gender;
	
	public User() {
		
	}

	public User(int userid, String name, String password, String email, String gender) {
		super();
		this.userid = userid;
		this.name = name;
		this.password = password;
		this.email = email;
		this.gender = gender;
	}

	public User(String name, String password, String email, String gender) {
		super();
		this.name = name;
		this.password = password;
		this.email = email;
		this.gender = gender;
	}

	public int getUid() {
		return userid;
	}

	public void setUid(int userid) {
		this.userid = userid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
		return "User [uid=" + userid + ", uname=" + name + ", password=" + password + ", email=" + email + ", gender="
				+ gender + "]";
	}
	
	

}
