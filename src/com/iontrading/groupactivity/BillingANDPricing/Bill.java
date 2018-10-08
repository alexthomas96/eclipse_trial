package com.iontrading.groupactivity.BillingANDPricing;
import com.iontrading.groupctivity.Order;

public class Bill {

	/* Bill class: to have a type(object) that can be returned to the bill requester*/
	
	Order orderedItems;		//the order object received from module B
	double amountToPay;			//price customer has to pay
	double discount;		//Overall discount offered to the customer

	public void setToPay(double tp)
	{
		this.amountToPay=tp;
	}

	public void setDiscount(double d)
	{
		discount=d;
	}

	public void setBillList(Order o)
	{
		orderedItems =o;
	}

	public double getToPay(){
		return(amountToPay);
	}

	public double getDiscount()
	{
		return(discount);

	}

	public Order setbillList()
	{
		return(orderedItems);
	}


}
