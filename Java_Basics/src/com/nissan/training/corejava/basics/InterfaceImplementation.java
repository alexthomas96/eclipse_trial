package com.nissan.training.corejava.basics;

class Bus implements IVehicle
{

	@Override
	public void steering() {
		// TODO Auto-generated method stub
		System.out.println("Bus steering");
	}

	@Override
	public void brakes() {
		// TODO Auto-generated method stub
		System.out.println("Bus brakes");
	}

	@Override
	public void gears() {
		// TODO Auto-generated method stub
		System.out.println("Bus gears");
	}
	
}

class Train implements IVehicle
{

	@Override
	public void steering() {
		// TODO Auto-generated method stub
		System.out.println("Train steering");
	}

	@Override
	public void brakes() {
		// TODO Auto-generated method stub
		System.out.println("Train brakes");
	}

	@Override
	public void gears() {
		// TODO Auto-generated method stub
		System.out.println("Train gears");
	}
	
}

public class InterfaceImplementation 
{
	public static void main(String[] args) 
	{
		IVehicle b = new Bus();
		Train t = new Train();
		b.steering();
		t.brakes();
	}
}
