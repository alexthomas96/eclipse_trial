package com.nissan.training.corejava.basics;

public class UserDefinedExceptionDemo 
{
	public static void main(String[] args) 
	{
		int value = 5000;
		if(value > 3000)
		{
			try
			{
				throw new BigValueException("Sucks to you nigger!");
			}
			catch(BigValueException bve) 
			{
				System.out.println(bve);//this statement calls toString() internally
			}
		}
	}
}
