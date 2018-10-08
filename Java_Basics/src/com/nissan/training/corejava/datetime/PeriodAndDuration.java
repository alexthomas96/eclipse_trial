package com.nissan.training.corejava.datetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodAndDuration 
{
	public static void checkingPeriod()
	{
		LocalDate date1 = LocalDate.now();
		LocalDate date2 = LocalDate.of(2014, Month.DECEMBER, 12);
		
		Period gap =  Period.between(date2, date1);
		System.out.println("Gap between dates is a period of : " + gap.toString().substring(1));
		
		long difference = ChronoUnit.DAYS.between(date2, date1);
		System.out.println("Chrono difference  : " + difference);
		//assert difference >=2000 : "Not Valid";
	}

	//to check duration
	public static void checkingDuration()
	{
		LocalTime time1 = LocalTime.now();
		System.out.println("The current time is : " + time1);
		Duration fiveHours = Duration.ofHours(5);
		
		//adding 5 hrs to current date and time and adding to time2
		LocalTime time2 = time1.plus(fiveHours);
		System.out.println("After adding five hours of duration : " + time2);
		
		Duration gap =Duration.between(time2, time1);
		System.out.println("Duration bewtwwen time1 and time 2 is : " + gap);
	
	}
	
	public static void main(String[] args) 
	{
		checkingPeriod();
		checkingDuration();
	}
}
