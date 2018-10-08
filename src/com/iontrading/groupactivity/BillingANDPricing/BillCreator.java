package com.iontrading.groupactivity.BillingANDPricing;
import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.iontrading.groupctivity.ItemsOrdered;
import com.iontrading.groupctivity.Order;


public class BillCreator {
	/* Class to calculate bill amount based on the running offers*/
	private double VAT=.145; 				//vat 14.5% 		
	//private int happyHourStart;				//Start hour(24hrs format) for happy hours
	//private int happyHourEnd;				//End hour(24 hours format) for happy hours
	//private double happyHourDiscount;		//Discount percent to be offered during happy hours

	HappyHours happyHours = HappyHours.getInstance();
	
	//To calculate amount to be received by cafeteria based on tax and discounts
	public Bill generateBill(Order o)
	{
		double amountToPay=0.0;			//Payment to be received by cafeteria
		double savings;					//total discount the customer gets
		double percentageDiscount;		//Used to decide if there is discount offered(happy hours) or not(zero percent)
		Bill bill_obj;					//Bill type object to be returned to bill requesting module
		//System.out.println("present"+o.getTime().get(Calendar.HOUR_OF_DAY));
		if(o.getTime().get(Calendar.HOUR_OF_DAY)>happyHours.getHappyHourStart() && o.getTime().get(Calendar.HOUR_OF_DAY)<happyHours.getHappyHourEnd())
			{//System.out.println("present"+o.getTime().get(Calendar.HOUR_OF_DAY));
			percentageDiscount=happyHours.getHappyHourDiscount();}
		else
			{percentageDiscount=0;}

		for(ItemsOrdered i:o.getItems())
		{	
			amountToPay+=i.getItem().getItemPrice()*i.getItemQuantity();
		}
		savings=amountToPay*percentageDiscount;
		amountToPay-=savings;
		amountToPay+=(amountToPay*VAT);

		bill_obj=new Bill();
		bill_obj.setToPay(amountToPay);
		bill_obj.setDiscount(savings);
		bill_obj.setBillList(o);

		return (bill_obj);
	}

	//To set happy hour timings and offered discount
	public void setHappyHours()
	{
		Scanner sc=new Scanner(System.in);

		try
		{
			System.out.println("Enter happy hour start hour(24 hours format):");
			int happyHourStart=sc.nextInt();
			
			if(happyHourStart<0||happyHourStart>24)
				{throw new InputMismatchException();}
			happyHours.setHappyHourStart(happyHourStart);
			//System.out.println("Start time:"+happyHourStart);
			System.out.println("Enter happy hour end hour(24 hours format:");
			int happyHourEnd=sc.nextInt();
			if( happyHourEnd<happyHourStart)
			{
				System.out.println("End time should be less than start time.");
				setHappyHours();
			}
			if(happyHourEnd<0||happyHourEnd>24)
				throw new InputMismatchException();
			happyHours.setHappyHourEnd(happyHourEnd);
			//System.out.println("End time:"+happyHourEnd);\
			 double happyHourDiscount = 0;
			boolean validateDiscount = true;
			while(validateDiscount)
			{


				try
				{   
					System.out.println("Enter happy hour discount percent:");
					
					//happyHourDiscount=(Double) sc.nextDouble()/100;	
					  happyHourDiscount= Double.parseDouble(sc.next())/100;
					 if(happyHourDiscount>0 && happyHourDiscount < 1){
						 happyHours.setHappyHourDiscount(happyHourDiscount);
						 validateDiscount =false;
					 }
					 else {
						 System.out.println("Please enter discount between 0 and 100");
						 //throw new NumberFormatException();
					 }
					
					//System.out.println("Discount:"+happyHourDiscount);
				}
				catch(NumberFormatException e)
				{
					
					System.out.println("Please enter a numeric value");
				}
				//happyHours.setHappyHourDiscount(happyHourDiscount);
			
			}
		}
		catch(InputMismatchException e)
		{
			System.out.println("Please enter an hour between 1 and 24");
			setHappyHours();
		}

	}

}
