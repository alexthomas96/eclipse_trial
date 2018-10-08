package com.iontrading.groupactivity.BillingANDPricing;
import java.util.Set;

import com.iontrading.groupctivity.Order;


public interface IOrderDesk 
{
	public Bill getBill(Order o);
	public Set<Item> askMenu();
}
