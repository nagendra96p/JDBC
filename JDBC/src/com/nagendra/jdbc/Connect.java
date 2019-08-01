package com.nagendra.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/Student";
		String un = "root";
		String pwd = "NEW PASSWORD";
		Connection con = null;
		try {
		    Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url,un,pwd);
			System.out.println("Connected");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error Connecting To Database");
		}
		
	}

}
