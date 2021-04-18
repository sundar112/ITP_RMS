package com.inventory.item.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class AddItemdao {
	
	public static boolean insertItem(String name, String date, String type, String unit, String price) {
		
		
		//create database connection
		String url = "jdbc:mysql://localhost:3306/rmsdb";
		String user = "root";
		String pass = "root";
		
		boolean isSuccess = false;
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pass);
			Statement stmt = con.createStatement();
			
			String sql = "insert into item values (0, '"+name+"', '"+date+"', '"+type+"', '"+unit+"', '"+price+"')";
			int rs = stmt.executeUpdate(sql);
			
			if (rs > 0)
				isSuccess = true;
			else
				isSuccess = false;
			
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		return isSuccess;
				
		
	}

}
