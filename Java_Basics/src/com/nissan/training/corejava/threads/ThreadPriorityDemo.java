package com.nissan.training.corejava.threads;

public class ThreadPriorityDemo extends Thread
{
	public void run()
	{
		System.out.println("Running thread name is : " + Thread.currentThread().getName());
		System.out.println("Running thread priority is : " + Thread.currentThread().getPriority());
	}

	public static void main(String[] args) //main has priority 5
	{
		ThreadPriorityDemo m1 = new ThreadPriorityDemo();
		ThreadPriorityDemo m2 = new ThreadPriorityDemo();
		m1.setPriority(Thread.MIN_PRIORITY);
		m2.setPriority(Thread.MAX_PRIORITY);
		m1.start();
		m2.start();
	}
}
