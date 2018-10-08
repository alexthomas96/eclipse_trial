package com.nissan.training.corejava.threads;

class Table
{
	synchronized void printTable(int n) //addition of synchronized keyword
	//void printTable(int n) //without synchronization
	{
		for(int i = 1; i<=5; i++)
		{
			System.out.println(n*i);
			try
			{
				Thread.sleep(400);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}

class MyThread1 extends Thread
{
	Table t;
	MyThread1(Table t) 
	{
		this.t = t;
	}
	public void run()
	{
		t.printTable(3);
	}
}
class MyThread2 extends Thread
{
	Table t;
	MyThread2(Table t) 
	{
		this.t = t;
	}
	public void run()
	{
		t.printTable(5);
	}
}


public class TestSynchronisation 
{
	public static void main(String[] args) 
	{
		Table obj = new Table();
		MyThread1 t1 = new MyThread1(obj);
		MyThread2 t2 = new MyThread2(obj);
		//t1.setPriority(Thread.MIN_PRIORITY);
		//t2.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();
	}
}
