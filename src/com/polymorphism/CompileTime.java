package com.polymorphism;
//Function Overloading
public class CompileTime {
public static void loginDisplay()
	{
		System.out.println("Function Overloading\nSame method with no arguments");
	}
public static void loginDisplay(String name, String password)
{
	System.out.println("\nSame methods with two String parameters");
	System.out.println("User name: "+name+" Password: "+password);
}
public static void loginDisplay(String name, String password, int mobileNumber)
{
	System.out.println("\nSame methods with two String parameters & one int parameter");
	System.out.println("User name: "+name+" Password: "+password+" Mobile No: "+mobileNumber);
}
public static void main(String[] args)
{
	loginDisplay();
	loginDisplay("Priya", "priya@123");
	loginDisplay("Priya","priya@456",1234567890);
}
}
