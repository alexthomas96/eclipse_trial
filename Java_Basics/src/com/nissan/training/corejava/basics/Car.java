package com.nissan.training.corejava.basics;

public class Car extends Vehicle {
	int VIN;
	public Car(int VIN, String doors, String windows) {
		super(VIN,doors,windows);
		System.out.println(this.VIN);
	}

}
