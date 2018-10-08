package com.nissan.training.corejava.basics;

public class Test 
{
	public static void main(String[] args) 
	{
		/*System.out.println("Hello");
		int a;
		a = 5;
		System.out.println(a);
		Car c = new Car(12,"Hello","Hi");
		*/
		
		Outer o = new Outer();
		// Outer.Inner oi = o.new Inner();
		Outer.Inner.m3();
		System.out.println();
		//oi.m2(); 
		//System.out.println(oi.b);
		//System.out.println("Hi");
	}
	

}

class Outer{
	
	int a = 10;
	
	void m1() {
		System.out.println(a);
	}
	
	static class Inner{ //Static class still allows creation of non static members
		static int b = 20; // = drawback
		void m2() {
			System.out.println(b);
		}
		
		static void m3() {   //To use static m3(), make class also static
			System.out.println(b);
		}
	}
}