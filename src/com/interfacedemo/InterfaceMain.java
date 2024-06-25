package com.interfacedemo;

public class InterfaceMain {
public static void main(String[] args)
{
	InterfaceMathsCalc.display();
	Addition addition = new Addition();
	System.out.println("\nAddition of a&b: "+addition.calculate());
	Subtraction subtraction = new Subtraction();
	System.out.println("Subtraction of a&b: "+subtraction.calculate());
	Multiplication multiplication = new Multiplication();
	System.out.println("Multiplication of a&b: "+multiplication.calculate());
	Division division = new Division();
	System.out.println("Division of a&b: "+division.calculate());
}
}
