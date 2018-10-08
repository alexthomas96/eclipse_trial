package com.nissan.traning.java.designpatterns;

public class EnumExample2 
{
	enum Day {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}
	
	public static void main(String[] args) 
	{
		Day day = Day.MONDAY;
		//System.out.println(Day.values());
		switch(day)
		{
			case SUNDAY : System.out.println("It's Sunday!");
			break;
			case MONDAY : System.out.println("It's Monday!");
			break;
			case TUESDAY : System.out.println("It's Tuesday!");
			break;
			case WEDNESDAY : System.out.println("It's Wednesday!");
			break;
		}
	}
}
