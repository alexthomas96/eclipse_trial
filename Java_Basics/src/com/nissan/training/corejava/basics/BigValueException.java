package com.nissan.training.corejava.basics;

//User defined exceptions
public class BigValueException extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3524925443954929560L;
	String message;
	public BigValueException(String message) 
	{
		this.message = message;
	}
	public String toString()
	{
		return message;
	}
}
