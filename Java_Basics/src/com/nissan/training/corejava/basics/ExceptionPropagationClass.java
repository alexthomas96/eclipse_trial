package com.nissan.training.corejava.basics;

public class ExceptionPropagationClass 
{
	void m1() throws Exception
	{
		System.out.println(2/0);
	}
	
	void m2() throws Exception
	{
		m1();
	}
	
	void m3() throws Exception
	{
		m2();
	}
}
