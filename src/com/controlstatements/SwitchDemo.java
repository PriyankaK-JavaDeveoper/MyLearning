package com.controlstatements;
import java.util.Scanner;
//USING SWITCH AND WHILE LOOP
public class SwitchDemo {
	public static void main(String[] args)
	{
	Scanner input = new Scanner(System.in);
	System.out.print("Enter number 1: ");
	int a=input.nextInt();
	System.out.print("Enter number 2: ");
	int b=input.nextInt();
	int res=0;
	while(res!=5)
	{
		System.out.println("\n1. Add \n2. Subtract \n3.Multiply \n4.Divide \n5.Exit");
		System.out.print("Enter your choice: ");
		res =input.nextInt();
	switch(res)
	{
	case 1:
		System.out.println("Addition: "+(a+b));
	break;
	
	case 2:
		System.out.println("Subtraction: "+(a-b));
	break;
	
	case 3:
		System.out.println("Multiplication: "+(a*b));
	break;
	
	case 4:
		System.out.println("Division: "+(a/b));
	break;
	default:
		System.out.println("Program Ends");
	}
	}
	input.close();
}
}