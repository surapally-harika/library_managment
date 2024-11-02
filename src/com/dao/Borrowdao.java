package com.dao;

import java.sql.SQLException;

import com.model.Borrow;

public interface Borrowdao {
	
	public String borrow(Borrow br) throws SQLException;
	

}
