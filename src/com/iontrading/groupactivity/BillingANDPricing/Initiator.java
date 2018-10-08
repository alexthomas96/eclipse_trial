package com.iontrading.groupactivity.BillingANDPricing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.iontrading.groupctivity.Eat;

public class Initiator {
	public static void main(String args[]) throws IOException
	{
		String ch="y";
		MenuManager MenuManager=new MenuManager();
		int choice=0;
		
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		do{System.out.println("Choices: \n1)Set Discount Conditions\n2)Show Menu\n3)Add Items\n4)Remove Item\n5)Update Price\n6)Exit");
			System.out.println("Enter your choice:");
			try
			{
				choice=Integer.parseInt(br.readLine());
				switch(choice)
				{
				case 1:BillCreator billing=new BillCreator();
				billing.setHappyHours();
				break;
				case 2:MenuManager.displayMenu();

				break;
				case 3:MenuManager.addItem();
				break;
				case 4:MenuManager.removeItem();
				break;
				case 5:
					MenuManager.updatePrice();
					break;
				case 6:Eat.main(null);
				break;
				default:
					System.out.println("OOps!! wrong choice");
				}
			}
			catch(NumberFormatException e)
			{
				System.out.println("Illegal Input format\n Enter only numerals !!!  ");

			}

			System.out.println("Do you want to continue ?");
			ch=br.readLine();
		}while(ch.equalsIgnoreCase("y"));
	}
}
