package com.nissan.training.java.collections;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

import com.nissan.training.corejava.basics.Test;

public class Trial 
{
	public static void main(String[] args) 
	{
		/*IOException e = new IOException("Dead!");
		ArrayList al = new ArrayList();
		al.add("Hello");
		al.add(123);
		al.add(e);
		System.out.println(al);*/
		
		TestCollection <IOException> tc = new TestCollection <IOException>();
		/*IOException ec = new IOException("Dead trail!");
		tc.addob(ec);*/
		tc.add(new IOException("Dead once!"));
		tc.add(new IOException("Dead twice!"));
		System.out.println(tc);
		System.out.println(tc.get(0));
		System.out.println(tc.get(1));
		System.out.println(" ");
		//ArrayList<IOException> ak = new ArrayList<IOException>();
		//ak.add(new IOException("Dead!"));
		//ArrayList<IOException> al = new ArrayList<IOException>(10);
		
		//ArrayList<IOException>[] al = new ArrayList<IOException>[100];
		
		
		TestCollection <TestCollection> newtc = new TestCollection<TestCollection>();
		newtc.add(tc);
		System.out.println(newtc);
		System.out.println(newtc.get(0));
		System.out.println(newtc.get(0).get(0));
		
		/*String[] s = new String[200];
		TestCollection<String []> sectc = new TestCollection<String []>();
		sectc.add(s); */
	}
}

class TestCollection <T>
{
	ArrayList<T> obj = new ArrayList<T>();
	public TestCollection() 
	{
		//System.out.println("Created the object : " + this.getClass().getName());
	}
	
	public void add(T obj)
	{
		this.obj.add(obj);
	}
	
	public T get(int i) 
	{
		return obj.get(i);
	}
}