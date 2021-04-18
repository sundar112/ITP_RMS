package com.inventory.item.model;

public class Item {
	private int itemId;
	private String itemName;
	private String addedDate;
	private String itemType;
	private float unit;
	private float price;
	private int financeId;
	
	
	public Item(int itemId, String itemName, String addedDate, String itemType, float unit, float price,int financeId) {
		this.itemId = itemId;
		this.itemName = itemName;
		this.addedDate = addedDate;
		this.itemType = itemType;
		this.unit = unit;
		this.price = price;
		this.financeId = financeId;
	}


	public int getItemId() {
		return itemId;
	}


	public String getItemName() {
		return itemName;
	}


	public String getAddedDate() {
		return addedDate;
	}


	public String getItemType() {
		return itemType;
	}


	public float getUnit() {
		return unit;
	}


	public float getPrice() {
		return price;
	}


	public int getFinanceId() {
		return financeId;
	}


}
