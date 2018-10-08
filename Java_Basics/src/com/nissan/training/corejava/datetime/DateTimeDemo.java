package com.nissan.training.corejava.datetime;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo 
{
	public static void LocalDateTimeAPI()
	{
		//current date
		LocalDate date = LocalDate.now();
		System.out.println("The current date is : " + date);
		
		//current time
		LocalTime time = LocalTime.now();
		System.out.println("The current time is : " + time);
		
		//current time + date
		LocalDateTime current = LocalDateTime.now();
		System.out.println("Current date and time : " + current);
		
		//Print in a particular format
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formattedDateTime = current.format(format);
		System.out.println("Date and Time in required format is : " + formattedDateTime);
	
		//Printing months days and seconds
		String month = current.getMonth().toString();
		int day = current.getDayOfMonth();
		int seconds = current.getSecond();
		System.out.println("Month : " + month + ", Day : " + day + ", Seconds : " + seconds);

		//printing some specified date
		LocalDate date2 = LocalDate.of(1950, 1, 26);
		System.out.println("The republic day : " + date2);
		
		//my trial
		LocalDate date3 = LocalDate.of(2018, 9, 27);
		LocalTime time3 = LocalTime.of(22, 22, 22);
		LocalDateTime dt = LocalDateTime.of(date3, time3);
		
		DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime dt2 = LocalDateTime.parse("2108-03-20 22:22:22", format2);
		System.out.println(dt2.toString().replaceAll("T", " "));
		Timestamp tsm = null;
		LocalDateTime dt3 = tsm.toLocalDateTime();
		
		System.out.println(date3);
		System.out.println(dt.toString());
		System.out.println(date3.equals(date));
		
		//printing date with current time
		LocalDateTime specificDate = current.withDayOfMonth(24).withYear(2016);
		System.out.println("Specific date with : " +  "Current time : " + specificDate);
	}
	
	public static void main(String[] args) 
	{
		LocalDateTimeAPI();
	}
}
