package com.nissan.training.java.collections;

import java.util.ArrayList;

class ThreadContainer<T extends Thread>
{
	ArrayList<T> al = new ArrayList<T>();
	
	public void add(T obj)
	{
		al.add(obj);
	}
	
	public T get(int i)
	{
		return al.get(i);
	}
}

class PrintClass
{
	synchronized public void newprint(int a, String b)
	{
		for(int i = 1;i<=5;i++)
		System.out.println("\tRunning thread : "+a+". "+b + " of value : " + i);
	}
}
class ThreadTrial extends Thread
{
	PrintClass p = new PrintClass();
	private static int count = 0;
	private int indcount;
	
	public ThreadTrial() {
		this.setName("Default!");
		indcount = ++count;
		//System.out.println("Started thread : "+indcount+". "+this.getName());
	}
	public ThreadTrial(String s) 
	{
		this.setName(s);
		indcount = ++count;
		//System.out.println("Started thread : "+indcount+". "+this.getName());
	}
	public void run()
	{
		p.newprint(indcount,this.getName());
		//System.out.println("\t\t\t\t\tRunning thread : "+indcount+". "+this.getName());
	}
}
public class ThreadCollection 
{
	public static void main(String[] args) 
	{
		ThreadContainer<ThreadTrial> tc = new ThreadContainer<ThreadTrial>();
		tc.add(new ThreadTrial());
		tc.add(new ThreadTrial("New Thread!"));
		tc.add(new ThreadTrial());
		tc.add(new ThreadTrial("Old Thread"));
		
		for(int i =0; i<4; i++)
		{
			tc.get(i).start();
		}
	}
}
