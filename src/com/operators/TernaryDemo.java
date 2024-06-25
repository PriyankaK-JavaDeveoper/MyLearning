package com.operators;

public class TernaryDemo {
	public static void main (String args[])
	{
		int a=10;
		int b=20;
		System.out.println("A= "+a+"\nB= "+b+"\nChecking for A<=B");
		boolean res=(a<=b)?true:false;
		System.out.println("Using Boolean Result is "+ res);
		String result = (a<=b)?"A is minimum":"B is minimum";
		System.out.println("Using String Result is "+ result);
	}
}
