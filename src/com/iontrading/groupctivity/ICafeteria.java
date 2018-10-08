package com.iontrading.groupctivity;

import java.util.Set;

import com.iontrading.groupactivity.BillingANDPricing.Item;

public interface ICafeteria {
	public Set<Item> getMenu();
	
	public void showBill(Order o);
}
