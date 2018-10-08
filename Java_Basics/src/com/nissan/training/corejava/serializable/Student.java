package com.nissan.training.corejava.serializable;

import java.io.Serializable;

public class Student implements Serializable 
{
	//transient int id  //this prevents id from being serialized
	int id;
	String name;
	public Student(int id, String name) 
	{
		this.id = id;
		this.name =name;
	}
}
