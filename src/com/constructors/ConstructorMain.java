package com.constructors;

public class ConstructorMain {
	public static void main(String[] args)
	{
		ConstructorDemo constructorDemo1 = new ConstructorDemo();
		@SuppressWarnings("unused")
		ConstructorDemo constructorDemo2 = new ConstructorDemo(3, "Rinu");
		System.out.println("\nPRIVATE CONSTRUCTOR");
		PrivateConstructor.add(10, 20);
		System.out.println("\nCOPY CONSTRUCTOR");
		@SuppressWarnings("unused")
		ConstructorDemo constructorDemo3=new ConstructorDemo(constructorDemo1);
	} 
}
