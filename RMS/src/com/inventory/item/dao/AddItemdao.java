package com.inventory.item.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class AddItemdao {
	
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	public static boolean insertItem(String name, String date, String type, String unit, String price) {
		
		
		
		boolean isSuccess = false;
		
		try {
			
			con = DbConnect.getConnection();
			stmt=con.createStatement();			
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
