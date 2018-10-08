package com.nissan.training.corejava.functionalinterfaces;

import java.util.*;
class RatingCompare implements Comparator<Movie>
{
	public int compare(Movie m1, Movie m2)
	{
		if (m1.getRating() < m2.getRating()) return -1;
		else if (m1.getRating() > m2.getRating()) return 1;
		else return 0;
	}
}

class NameCompare implements Comparator<Movie>
{
	public int compare(Movie m1, Movie m2)
	{
		return m1.getName().compareTo(m2.getName());
	}
}

public class ComparatorTrial 
{
	public static void main(String[] args) 
	{
		ArrayList<Movie> list = new ArrayList<Movie>();
		list.add(new Movie("Force Awakens", 8.3, 2015));
		list.add(new Movie("Star Wars", 8.7, 1977));
		list.add(new Movie("Empire Strikes back", 8.8, 1989));
		list.add(new Movie("Return of the Jedi", 8.4, 1983));
		
		System.out.println("Movies after sorting by rating : \n");
		RatingCompare ratingCompare = new RatingCompare();
		Collections.sort(list, ratingCompare);
		for(Movie movie : list)
		{
			System.out.println(movie.getName() + " " +
							   movie.getRating() + " " +
							   movie.getYear());
		}
		
		System.out.println("\nMovies after sorting by name : \n");
		NameCompare nameCompare = new NameCompare();
		Collections.sort(list, nameCompare);
		for(Movie movie : list)
		{
			System.out.println(movie.getName() + " " +
							   movie.getRating() + " " +
							   movie.getYear());
		}
	}
}
