package com.nissan.training.corejava.strings;

public class TestImmutableString 
{
	public static void main(String[] args) 
	{
		String s= "Abdul";
		s.concat("Kalaam");
		System.out.println(s); //prints Abdul because string is immutable
		String s2 = s.concat("Kalaam"); //works
		System.out.println(s2);
		
		String k = "abc";
		String k1 = "abc";
		
		String k2 = new String("abc");
		String k3 = new String("abc");
		System.out.println(k2.equals(k3)); /** k==k1 - True
											   k == k2 - False
											   k.equals(k2) - True
											   k == k3 - False
											   k2 == k3 - False (separate locations)
											   k2.equals(k3) - True
											*/
		StringBuffer l = new StringBuffer("hello");
		StringBuffer l2 = new StringBuffer("hello");
		System.out.println(l.equals(l2)); //false as checks address + content for
										  // StringBuffer
		System.out.println(s.charAt(0));
		System.out.println(s.length());
		System.out.println(s.substring(1, 4));
		System.out.println(k2.contains(k3));
		System.out.println(k2.toUpperCase());
		//System.out.println(l.replace(arg0, arg1, arg2));
	}
}
