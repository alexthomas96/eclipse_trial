package com.nissan.training.java.collections;

import java.util.ArrayList;

class Address {}

class EmployeeDet 
{
	private String firstName;
	private String lastName;
	private double salary;
	public Address address;
	
	public EmployeeDet(String lastName,String firstName) 
	{
		this.lastName = lastName;
		this.firstName = firstName;
		this.address = new Address();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}

public class Employee
{
	public static void main(String[] args) 
	{
		ArrayList <EmployeeDet> emps = new ArrayList<EmployeeDet>();
		emps.add(new EmployeeDet("A","G"));
		emps.add(new EmployeeDet("T","A"));
		emps.add(new EmployeeDet("K","J"));
		System.out.println(emps.size());
		//System.out.println(emps);
		EmployeeDet e = emps.get(1);
		e.setLastName("new");
		System.out.println(e.getFirstName() + " " + e.getLastName() + " " + e.getSalary());
	}
}