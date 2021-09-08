package com.csi.serverside;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBValidate {
	public static boolean isValidate(String username, String password) {
		boolean status = false;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/loginusers", "root", "root");
			String a = " select * from user where username = ? and  password = ? " ;
			PreparedStatement preparedStatement = con.prepareStatement(a);
			preparedStatement.setString(1, username);
			preparedStatement.setString(2, password);
			ResultSet rs = preparedStatement.executeQuery();
			status = rs.next();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
		}
	}

