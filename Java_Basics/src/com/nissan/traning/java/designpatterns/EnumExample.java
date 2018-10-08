package com.nissan.traning.java.designpatterns;

import java.util.Enumeration;

public class EnumExample 
{
	public enum Season { WINTER, SPRING, SUMMER, FALL}
	
	public static void main(String[] args) 
	{
		for(Season s : Season.values()) //enhanced for loop (or) for each - JDK 1.5
			System.out.println(s.ordinal());                //only forward movement
		
		for(String s : args) //arguments
			System.out.println(s);
		System.out.println(Season.values()[3].toString());
		//System.out.println(Season.valueOf(arg0, arg1);
	//	Enumeration<String> e =(Enumeration<String>(Season.values());
		
		
	}
}
