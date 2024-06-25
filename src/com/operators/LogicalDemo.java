package com.operators;

public class LogicalDemo {
	public static void main (String args[])
	{
		int a=25;
		int b=50;
		int x=20;
		int y=10;
		
		if(a<b && x<y)
			System.out.println("both are true in && Operator");
		else
			System.out.println("one is false and so if condition failed in && Operator");	
		
		if(a<b || x<y)
			System.out.println("one is true, one is false and so if condition executed || Operator");
		if(!(a<b || x<y))
			System.out.println("Any one is true");
		else
			System.out.println("Using NOT operator");
	}
}
