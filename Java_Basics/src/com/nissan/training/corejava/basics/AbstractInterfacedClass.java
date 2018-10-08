package com.nissan.training.corejava.basics;

abstract class AbsIntClass implements IVehicle
{
	abstract public void wheels();
}

class AbsIntTrial extends AbsIntClass
{

	@Override
	public void steering() {
		// TODO Auto-generated method stub
		System.out.println("Steering");
	}

	@Override
	public void brakes() {
		// TODO Auto-generated method stub
		System.out.println("Brakes");
	}

	@Override
	public void gears() {
		// TODO Auto-generated method stub
		System.out.println("gears");
	}

	@Override
	public void wheels() {
		// TODO Auto-generated method stub
		System.out.println("wheels2");
	}
	
}
public class AbstractInterfacedClass 
{
	public static void main(String[] args) 
	{
		AbsIntTrial ait = new AbsIntTrial();
		ait.wheels();
	}
}
