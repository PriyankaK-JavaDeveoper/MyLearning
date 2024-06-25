package com.interfacedemo;

public interface InterfaceMathsCalc {
	int calculate();//By default its is public abstract 
	
	int a = 20; //By default public static final, cannot be changed
	int b = 10; //By default public static final, cannot be changed
	
	//Interface do not have constructors
	/*public InterfaceMathsCalc()
	{
	}*/
	
	public static void display()
	{
		System.out.println("Value of a: "+a);
		System.out.println("Value of b: "+b);
	}
	
}
