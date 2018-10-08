package com.nissan.training.corejava.strings;

class A
{
	void show()
	{
		System.out.println("Hello!");
	}
	
}

class B extends A
{
	@Override
	void show()
	{
		System.out.println("Hello");
	}
	
	@Deprecated
	void deadFunction()  //Strikethrough for deprecated
	{
		System.out.println("Deprecated");
	}
}
public class AnnotationsExample {
	public static void main(String[] args) 
	{
		@SuppressWarnings("unused")
		B b = new B(); 
	}

}
