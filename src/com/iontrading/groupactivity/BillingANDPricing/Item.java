package com.iontrading.groupactivity.BillingANDPricing;


public class Item 
{
	private int id; 		//Unique id of the item
	private String name;	//Name of the menu item
	private double price; 	//price of the item in the menu

	public void setItemName(String name)
	{
		this.name=name;
	}
	public void setItemPrice(double price)
	{
		this.price=price;
	}
	public String getItemName()
	{
		return name;
	}
	public double getItemPrice()
	{
		return price;
	}
	public int getItemId() {
		return id;
	}
	public void setItemId(int id) {
		this.id = id;
	}
	
}
