package com.nissan.training.corejava.functionalinterfaces;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

//Comparable interface - natural sorting order = compare with itself

class Movie implements Comparable<Movie>
{
	private double rating;
	private String name;
	private int year;
	
	//Used to sort movies 
	public int compareTo(Movie m)
	{
		return this.year - m.year; //by year
		//return (int)this.name - m.name; //by name
		//return (int)(10*(this.rating - m.rating)); //by rating
	}
	
	public Movie(String nm, double rt, int yr) 
	{
		this.name = nm;
		this.rating = rt;
		this.year = yr;
	}

	public double getRating() {
		return rating;
	}

	public String getName() {
		return name;
	}

	public int getYear() {
		return year;
	}
	
}

public class ComparableTrial 
{
	public static void main(String[] args) 
	{
		ArrayList<Movie> list = new ArrayList<Movie>();
		list.add(new Movie("Force Awakens", 8.3, 2015));
		list.add(new Movie("Star Wars", 8.7, 1977));
		list.add(new Movie("Empire Strikes back", 8.8, 1989));
		list.add(new Movie("Return of the Jedi", 8.4, 1983));
		
		Collections.sort(list);
		System.out.println("Movies after sorting : ");
		for(Movie movie : list)
		{
			System.out.println(movie.getName() + " " +
							   movie.getRating() + " " +
							   movie.getYear());
		}
	}
}
