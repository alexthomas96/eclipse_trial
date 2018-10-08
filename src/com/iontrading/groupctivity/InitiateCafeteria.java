package com.iontrading.groupctivity;

import java.util.Set;

import com.iontrading.groupactivity.BillingANDPricing.Item;

public class InitiateCafeteria {
public void initiateCafeteria(){
	  IONDhaba ionDhaba = new IONDhaba();
	  Customer customer = new Customer();
	   customer = ionDhaba.getCustomerCredentials(customer);
       CustomerActivity customerActivity = new CustomerActivity(customer);
		Set<Item> menu = ionDhaba.getMenu();
       ionDhaba.showMenu(menu);
       Order order = customerActivity.placeOrder(menu);
       ionDhaba.showBill(order);  
}
}
