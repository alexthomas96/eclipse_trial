package com.iontrading.groupactivity.BillingANDPricing;


import java.util.*;
import java.util.regex.*;

public class MenuManager implements IMenuManager{

	/*To perform operations on the menu of items.
	 * Operations:adding item
	 * 			  removing item
	 * 			  updating price
	 * 			  displaying menu.*/


	public boolean updatePrice()
	{
		Scanner sc=new Scanner(System.in);
		String itemName;
		Double itemPrice=0.0;
		boolean itemSearch=false;
		Item ite=null;
		
		System.out.println("Enter item name:");
		itemName=sc.next();
		for(Item it:Menu.getInstance().getItemMenu())
		{
			if(it.getItemName().equalsIgnoreCase(itemName))
			{
				itemSearch=true;
				ite = it;
				break;
			}
		}
		if(!itemSearch)
		{
			System.out.println("No such item exists.Please try again.");
			updatePrice();
		}
		boolean flag=true;
		while(flag)
		{
		try
		{
			System.out.println("Enter "+itemName+"'s new price:");
			itemPrice=Double.parseDouble(sc.next());
			flag=false;
		}
		catch(NumberFormatException e)
		{
			System.out.println("Please enter a numeric value");
			
		}
		}
	
        ite.setItemPrice(itemPrice);
        Menu.getInstance().getItemMenu().add(ite);
        
		return false;
	}

	public void addItem()
	{


		Scanner in=new Scanner(System.in);
		int number_of_items=0;
		try{
			System.out.println("How many items do you want to add ?");
			number_of_items=in.nextInt();
		}
		catch(InputMismatchException e)
		{
			System.out.println("Please enter a numeric value");
		}

		for(int x=0;x<number_of_items;x++)
		{
			
			Item it=new Item();
			double price=0.0;
			int maxId=0;
			String name=null;
			boolean flag=true;
			while(flag)
			{
			System.out.println("Enter name of item :");
			name= in.next().toLowerCase();
			if(!Pattern.matches("[a-zA-Z]+",name))
			{
				System.out.println("Name can only have characters.");
				flag=true;
			}
			else
				flag=false;
			}	
			for(Item item:Menu.getInstance().getItemMenu())
			{if(item.getItemName().equalsIgnoreCase(name))
			{
				System.out.println("Can not add this item.Item already exists!!!");
				addItem();
			}	
			}
			System.out.println("Enter price of item :");
			try
			{
				price = in.nextDouble();
			}
			catch(InputMismatchException e)
			{
				System.out.println("Please enter a numeric value");
			}
			for(Item item:Menu.getInstance().getItemMenu()){
				if(item.getItemId()>maxId)
					maxId=item.getItemId();

			}
			it.setItemId(maxId+1);
			it.setItemName(name);
			it.setItemPrice(price);
			Menu.getInstance().getItemMenu().add(it);
			System.out.println("Item added successfully.");
		}
	}


	//To remove an item from menu
	public boolean removeItem()
	{
		Scanner in =new Scanner(System.in);
	
		System.out.println("Enter item name for deletion :");
		String name=in.next();
	
		for(Item item_delete:Menu.getInstance().getItemMenu())
		{
			if(item_delete.getItemName().equalsIgnoreCase(name))
			{
				Menu.getInstance().getItemMenu().remove(item_delete);
				System.out.println("Item successfully deleted.");
				return true;
			}
		}
		System.out.println("No such item exists in the menu.");
		return false;
	}

	//To display all the menu items
	public void displayMenu()
	{   System.out.format("%-15s%20s\n","Item Name","Price");

		for(Item i:Menu.getInstance().getItemMenu())
		{System.out.format("%-15s%20s\n",i.getItemName(),i.getItemPrice()+"");
		
			
		}
	}
}
