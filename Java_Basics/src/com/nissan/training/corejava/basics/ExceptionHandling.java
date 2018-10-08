package com.nissan.training.corejava.basics;

public class ExceptionHandling 
{
	public static void main(String[] args) 
	{
		try
		{
			int a[] = {1,2,3,4,5};
			System.out.println(a[-1]);
		} 
		//catch(Exception e)
		catch (ArithmeticException e)//if wrong exception given, program terminates here        
		{
			//System.out.println(e); // - only exception, no details
			e.printStackTrace();
		}
		finally //if catch breaks, finally will execute.code outside finally will not
		{	
			System.out.println("Done");
		}
		System.out.println("Outside finally block!"); //won't run
	}
}
