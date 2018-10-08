package com.nissan.training.corejava.serializable;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class PersistDemo 
{
	public static void main(String[] args) throws Exception 
	{
		//Serialization
		Student s1 = new  Student(211, "Jackson");
		FileOutputStream fout = new FileOutputStream("C:\\Users\\ndh00145\\Desktop\\bob.txt");
		
		ObjectOutputStream out = new ObjectOutputStream(fout);
		
		out.writeObject(s1);
		out.writeObject(new Student(500, "Simon"));
		out.flush();
		out.close();
		fout.close();
		
		//De Serialization
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\Users\\ndh00145\\Desktop\\bob.txt"));
		Student s =null;
		try 
		{ 
			while(true)
			{
				s= (Student)in.readObject();
				System.out.println(s.id + " " + s.name);
		
			}
		}
		catch (EOFException e)
		{
			System.out.println("file over!");
		}
		in.close();
	}
}
