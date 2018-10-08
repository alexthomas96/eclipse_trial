package com.nissan.training.corejava.functionalinterfaces;

public class LambdaTrial 
{
	public static void main(String[] args) 
	{
		new Thread(() -> 
		{
			System.out.println("New Thread created!");
		}).start();
	}
}
