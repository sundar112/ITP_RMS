package com.inventory.item.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.inventory.item.model.Item;

public class Admin_inventoryDao {
	
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	
	public static List <Item> validate(int ItemId, String ItemName){
		
		ArrayList<Item> item = new ArrayList<>();
		
		
		//validate
		
		try {		
			con = DbConnect.getConnection();
			stmt=con.createStatement();
			String sql = "select * from Item where ItemId='"+ItemId+"' or ItemName '"+ItemName+"'";
			rs = stmt.executeQuery(sql);			
			if(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String addedDate = rs.getString(3);
				String type = rs.getString(4);
				float unit = rs.getFloat(5);
				float price = rs.getFloat(6);
				int financialId = rs.getInt(7);
				
				Item itm = new Item(id,name,addedDate,type,unit,price,financialId);
				item.add(itm);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		return item;
		
	}
	

}
