package com.nissan.training.corejava.basics;

public class ExceptionPropagatonDemo 
{
	public static void main (String[] args) throws Exception //now handled by jvm 
	{
		ExceptionPropagationClass epc = new ExceptionPropagationClass();
		//try
		//{
			epc.m3();
		//}
		/*catch(Exception e)
		{
			System.out.println(e);
		}*/
	}
}
