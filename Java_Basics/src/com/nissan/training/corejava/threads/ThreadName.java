package com.nissan.training.corejava.threads;

public class ThreadName extends Thread
{
	public void run() 
	{
		System.out.println("Running thread : " + this.getName());
	}
	public static void main(String[] args) 
	{
		ThreadName t1 = new ThreadName();
		ThreadName t2 = new ThreadName();
		System.out.println("Name of t1 : " + t1.getName());
		System.out.println("Name of t2 : " + t2.getName());
		
		t1.start();
		t2.start();
		//t1.run();
		
		t1.setName("Nissan");
		System.out.println("After changing name of t1 : " + t1.getName());
	}

}
