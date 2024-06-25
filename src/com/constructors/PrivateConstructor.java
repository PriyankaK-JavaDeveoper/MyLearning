package com.constructors;

public class PrivateConstructor {
private PrivateConstructor()
{
	
}
public static void add(int a,int b)
{
	int c=a+b;
	System.out.println("\nStatic Method add() invoked by class PrivateConstructor");
	System.out.println("Addition of two arguments: "+c); 
}
}
