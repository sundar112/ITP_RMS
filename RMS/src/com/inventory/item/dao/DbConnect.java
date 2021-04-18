package com.inventory.item.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnect {
	
	private static String url = "jdbc:mysql://localhost:3306/rmsdb";
	private static String userName = "root";
	private static String pass = "root";
	private static Connection con;
	
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(url, userName, pass);
			
		} catch (Exception e) {
			System.out.println("DataBase is not success");
		}
		return con;
	}
	
}
