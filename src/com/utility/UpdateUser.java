package com.utility;

import java.sql.SQLException;
import java.util.Scanner;

import com.dao.Userdao;
import com.dao.UserdaoImp;
import com.model.User;

public class UpdateUser {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the userid:");
		int userid = sc.nextInt();
		System.out.println("Enter the password:");
		String password = sc.nextLine();
		Userdao udao = new UserdaoImp();
		
		try {
			User user = udao.UpdateUser(userid, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
