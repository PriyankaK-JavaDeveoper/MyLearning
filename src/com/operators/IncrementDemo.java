package com.operators;

public class IncrementDemo {
	public static void main(String args[])
	{
		//post increment
		int x=1;
		System.out.println("Post Increment");
		System.out.println("1st Print X is : "+x);
		System.out.println("1st Increment X++: "+(x++));
		System.out.println("2nd Increment X++: "+(x++));
		System.out.println("3rd Print X is: "+x+"\n\n");
		
		//pre increment
		int y=1;
		System.out.println("Pre Increment");
		System.out.println("1st Print Y is: "+y);
		System.out.println("1st Increment ++Y: "+(++y));
		System.out.println("2nd Increment ++Y: "+(++y));
		System.out.println("3rd Print Y is: "+y);
	}
}
