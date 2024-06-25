package com.abstraction;
public class AbstractMain { 
public static void main(String[] args)
{
	//MathsCalc.getInput();
	Addition addition = new Addition();
	System.out.println("\nAddition: "+addition.calculate());
	Subtraction subtraction = new Subtraction();
	System.out.println("Subtraction: "+subtraction.calculate());
	Multiplication multiplication = new Multiplication();
	System.out.println("Multiplication: "+multiplication.calculate());
	Division division = new Division();
	System.out.println("Division: "+division.calculate());
}
}
