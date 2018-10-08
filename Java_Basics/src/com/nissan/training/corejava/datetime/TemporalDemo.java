package com.nissan.training.corejava.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TemporalDemo 
{
	//Function to check date and time according to requirement
	public static void checkingAdjusters()
	{
		LocalDate date = LocalDate.now();
		System.out.println("The current date is : " + date);
		
		//to get the first day of next month
		LocalDate dayOfNextMonth = date.with(TemporalAdjusters.firstDayOfNextMonth());
		System.out.println("First day of next month is : " + dayOfNextMonth);
		
		//get next saturday
		LocalDate nextSaturday = date.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
		System.out.println("Next saturday from now is : " + nextSaturday);
		
		//first day of current month
		LocalDate firstDay = date.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println("First day of month : " + firstDay);
		
		//last date of current month
		LocalDate lastDay = date.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println("Last day of the month is : " + lastDay);
		
	}
	
	public static void main(String[] args) 
	{
		checkingAdjusters();
	}
}
