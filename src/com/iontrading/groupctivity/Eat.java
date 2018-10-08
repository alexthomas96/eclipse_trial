package com.iontrading.groupctivity;

import java.io.Console;
import java.io.IOException;
import java.util.Scanner;

import com.iontrading.groupactivity.BillingANDPricing.Initiator;

public class Eat {


	public static void main(String[] args) throws IOException {
		int userChoice = 0 ;
		System.out.println("Welcome to ION Dhaba\n");
		Scanner scanUser = new Scanner(System.in);
		System.out.println("Enter type of User :");
		System.out.println("1. Administrator");
		System.out.println("2. Customer");
		boolean validateChoice = true;
		while(validateChoice)
		{
			try{
				userChoice = scanUser.nextInt();
				if(userChoice == 1 | userChoice ==2)
					validateChoice = false;
				else{
					throw new Exception();
				}
			}
			catch(Exception ee){
				System.out.println("Please enter valid choice!! 1 or 2\n");

			}
		}
		if(userChoice == 1){
			boolean validatePassword = true;
			while(validatePassword){


				System.out.println("Enter Password: ");

				Scanner scanPassword = new Scanner(System.in);
				String password = "123456";
				if(scanPassword.next().equals(password)){
					Initiator.main(null);
					validatePassword = false;	
				}
				else{
					System.out.println("enter valid password!!");
				}

			}
		}
		else{

			new InitiateCafeteria().initiateCafeteria();

		}
		main(null);
	}

}
/*Console console = System.console();
if(console==null)
{
	System.out.println("print");

}
char userPassword[] = console.readPassword("Password1");
String password = "123456";
char passwordArray[] = password.toCharArray();

for(int i = 0 ; i<passwordArray.length ; i++){
	if(passwordArray[i]!= userPassword[i]){

		System.out.println("Wrong Password");
		System.out.println("Enter valid password!!");

	}
	else{
		validatePassword = false;
	}
}
 */					