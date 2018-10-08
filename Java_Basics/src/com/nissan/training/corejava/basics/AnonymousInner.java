package com.nissan.training.corejava.basics;

abstract class Person{
	abstract void eat();
}

public class AnonymousInner {
	public static void main(String[] args) 
	{
		Person p = new Person(){
			void eat(){                     //eat() is overridden without extending. 
				System.out.println("Nice fruits!"); //That class for which extension
			}										//happens is anonymous
		};
		p.eat();
	}
}
