package com.nissan.training.corejava.functionalinterfaces;

public class FunctionalInterfaceTest 
{
	public static void main(String[] args) 
	{
		//create anonymous inner object
		new Thread(new Runnable()
		{
			@Override
			public void run()
			{
				System.out.println("New thread created");
			}
		}).start();
	}
}
