package com.constructors;

public class ConstructorDemo {
int number;
String name;
static int count=0;
static String company="Google";
public ConstructorDemo()
{
	this(2,"Priyanka");
	number = 1;
	name = "Priya";
	System.out.println("\nNo arguments constructor invoked");
	System.out.println("Number: "+number+" Name: "+name+" Company: "+company); 
}
public ConstructorDemo(int number, String name)
{
	count++;
	System.out.println("\nCONSTRUCTOR CHAINING");
	System.out.println("\nParametrized constructor invoked: "+count+" times");
	this.number=number;
	this.name=name;
	System.out.println("Number: "+number+" Name: "+name+" Company: "+company); 
}
public ConstructorDemo(ConstructorDemo constructorDemo)
{
	this.name=constructorDemo.name;
	this.number=constructorDemo.number;
	System.out.println("Number: "+number+" Name: "+name+" Company: "+company); 
}
}
