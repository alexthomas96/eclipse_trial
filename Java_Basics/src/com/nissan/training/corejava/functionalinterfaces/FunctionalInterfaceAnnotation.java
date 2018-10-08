package com.nissan.training.corejava.functionalinterfaces;

@FunctionalInterface
interface Square
{
	int a=10,b=20;
	int calculate(int x);
	//int add(int y);
	default void show() 
	{
		
	}
	
	default void display()
	{
		
	}
}
public class FunctionalInterfaceAnnotation //implements Square - error because calculate needs to be overriden
{
	public static void main(String[] args) 
	{
		int a = 5;
		Square s = (int y) -> y*y; //lambda exp.
		int ans = s.calculate(a); //parameter passed and return type must be same as in prototype 
		System.out.println(ans);
	}
}
