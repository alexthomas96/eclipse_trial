package com.iontrading.groupctivity;

import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Pattern;

import com.iontrading.groupactivity.BillingANDPricing.Bill;
import com.iontrading.groupactivity.BillingANDPricing.Item;
import com.iontrading.groupactivity.BillingANDPricing.OrderDesk;

public class IONDhaba implements ICafeteria{

	/*CafeManager cafeManager = CafeManager.getInstance();*/                  //cafeManager is a singleton class
   OrderDesk orderDesk = new OrderDesk();
	public Set<Item> getMenu(){
		//CafeManager cafeManager = CafeManager.getInstance();
		Set<Item> menu = orderDesk.askMenu();                            //cafeManager.askMenu() returns a set of items from MenuManiplator class 
		return menu;
	}


	public Customer getCustomerCredentials(Customer customer){
		Scanner scanCustomerCredentials = new Scanner(System.in);

		int customerId = 1;
		customer.setCustomerId(customerId);
		boolean invalidInput = true;
		while(invalidInput){
			System.out.println("Enter Name: ");
			try{
				String customerName = scanCustomerCredentials.next();
				if(Pattern.matches("^[a-zA-Z\\s]+$", customerName))	
				{
					customer.setCustomerName(customerName);
				}
				else {
					throw new Exception();
				}
				invalidInput = false;
			}
			catch(Exception ee){
				System.out.println("Please Enter Valid Name!!");
			}
		}
		//Scanner scanPhoneNumber = new Scanner(System.in);
		invalidInput = true;
		while(invalidInput){
			System.out.println("Enter Phone Number : ");
			try{
				Long customerPhoneNumber = Long.parseLong(scanCustomerCredentials.next());
				if(Pattern.matches("[0-9]{10}", customerPhoneNumber.toString()))
				{customer.setCustomerPhone(customerPhoneNumber);
				invalidInput = false;}
				else{
					throw new Exception();
				}
			}
			catch(Exception ee){
				System.out.println("Please Enter Valid Phone Number!!");
			}
		}
		return customer;

	}

	public void showBill(Order order){
		//CafeManager cafeManager = CafeManager.getInstance();
		Bill bill = orderDesk.getBill(order);                                  //cafeManager.getBill() takes Order object and return the Bill object
		List<ItemsOrdered> itemList = order.getItems();                          //getting items in list to display in the bill 
		System.out.println("*********BILL********");
		//System.out.println("Item Name\tQuantity\tPrice\n");
		System.out.format("%4s%20s%25s\n","Item Name","Quantity","Price");


		for(ItemsOrdered itemsOrdered: itemList){
			//System.out.println(i.getItemName()+"\t"+i.getItemQuantity()+"\t"+i.getItemPrice()*i.getItemQuantity()+"\n");
			//System.out.format("%4s%20s%25s\n",itemsOrdered.getItemName(),itemsOrdered.getItemQuantity(),itemsOrdered.getItemPrice()*itemsOrdered.getItemQuantity());
		}

		System.out.println("TO Pay "+bill.getToPay());
		System.out.println("You Saved "+bill.getDiscount());

	}

	//method to display menu to user coming in form of Set<items> from Main  
	public void showMenu(Set<Item> menu){
		System.out.println("ION DHABA");
		System.out.println("\n********MENU******");
		System.out.println("\n\n\n");
		//TableBuilder tableBuilder = new TableBuilder();
		//tableBuilder.addRow("Id","Item","Price");
		System.out.format("%-4s%-20s%-25s","Id","Item","Price");
		int id = 1;
		for(Item menuSet : menu){
			/*        	System.out.println(menuSet.getItemName());
        	System.out.println(menuSet.getItemPrice());*/
			System.out.println();
			//System.out.println(menuSet);
			System.out.format("%-4s%-20s%-25s",id+"",menuSet.getItemName(),menuSet.getItemPrice());
			//tableBuilder.addRow(id,menuSet.getItemName(),menuSet.getItemPrice());
			System.out.println();
			id++;
		}
	}
}
