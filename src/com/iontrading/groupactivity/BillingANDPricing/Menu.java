package com.iontrading.groupactivity.BillingANDPricing;

import java.util.HashSet;
import java.util.Set;
/*
Menu Class to setup initial menu with default items
 */
public class Menu 
{

	private Set<Item> itemMenu= new HashSet<Item>();					//Collection of item objects
	private static Menu menu;											//Declaration of Menu object

	private Menu(){
		setMenu();
	}													//Singleton Implementation

	public static Menu getInstance()
	{								//Method to Create instance of Menu object
		if(menu==null)
		{
			menu=new Menu();

		}
		return menu;
	}
	
	public void setMenu()												// Method to setup the initial Menu
	{
		Item item;

		String names[]={"burger","fries","soup","coffee","ice cream"};
		double prices[]={50.0,65.0,30.0,60.0,30.0};
		int id[]={1,2,3,4,5};
		for(int i=0;i<names.length;i++)
		{
			item=new Item();
			item.setItemName(names[i]);
			item.setItemPrice(prices[i]);
			item.setItemId(id[i]);
			itemMenu.add(item);
		}
	}

	public Set<Item> getItemMenu() 
	{								//Getter method to return Menu object
		return itemMenu;
	}

}
