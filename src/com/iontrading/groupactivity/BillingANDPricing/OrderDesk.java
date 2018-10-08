package com.iontrading.groupactivity.BillingANDPricing;
import java.util.Set;

import com.iontrading.groupctivity.Order;


public class OrderDesk implements IOrderDesk 
{
	/* Acts as a mediator between the customer serving module and back end module.
	 * Functionalities: return menu
	 * 					return Bill
	 * */
	
		// returns the menu to the customer
		public Set<Item> askMenu(){
			
			return (Menu.getInstance().getItemMenu());
		}
		
		//returns the bill to the customer
		public Bill getBill(Order o)
		{
			return (new BillCreator().generateBill(o));
		}
	}
