package com.nissan.traning.java.designpatterns;

class Singleton //should have been public
{
	private static Singleton s = null;
	private Singleton()
	{
		System.out.println("I am singleton");
	}
	
	public static Singleton getInstance()
	{
		if(s == null)
			s = new Singleton(); //late initialization
		return s;
	}
}
public class SingletonDemo 
{
	public static void main(String[] args) 
	{
		Singleton.getInstance();
		Singleton.getInstance(); //All 3 statements create only one object
		Singleton.getInstance();
	}
}
