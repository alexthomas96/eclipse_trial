package com.nissan.training.corejava.basics;

public class BeanTest 
{
	public static void main(String[] args) 
	{
		EmployeeBean eb = new EmployeeBean();
		eb.setId(100);
		eb.setFirstName("Alex");
		eb.setLastName("Thomas");
		eb.setSalary(20000);
		
		System.out.println(eb.getId() + " " + eb.getFirstName() + " " + eb.getLastName() + " " + eb.getSalary());
	}
}
