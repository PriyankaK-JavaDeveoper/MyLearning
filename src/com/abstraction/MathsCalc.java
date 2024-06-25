package com.abstraction;
import java.util.Scanner;

public abstract class MathsCalc {
public abstract int calculate();//Abstract(must) method does not have implementation
static int a,b;
//Abstract class can have constructor
public MathsCalc()
{
	a=40;
	b=20;
	System.out.println("Constructor initialized");
	System.out.println("Value of a: "+a+" Value of b: "+b);
}
//Abstract class can have instance method
public static void getInput()
{ 
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter value of a: ");
	a=scan.nextInt();
	System.out.print("Enter value of b: ");
	b=scan.nextInt();
	scan.close();
}
}
