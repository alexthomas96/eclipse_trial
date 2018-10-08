package com.nissan.traning.java.designpatterns;

class A
{
	int a,b;
	static void add(int a, int ... b)
	{
		for(int x : b)
			System.out.println(a + " " + x);
	}
}
public class VarArgs 
{
	public static void main(String ... args) 
	{
		A.add(10, 20, 30, 40, 50, 60, 70, 80);
	}
}
