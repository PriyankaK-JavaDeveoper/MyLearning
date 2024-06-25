package com.inheritance;
import java.util.Scanner;
//Used Concepts Multilevel Inheritance & Random number generation
public class PlaceOrder extends AddCart 
{
	int systemOTP,userOTP;
	public PlaceOrder() 
	{
		super.displayProductList();//top parent class method
		super.addCart();//immediate parent class method
		}
	public void paymentMethod()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("\nYour total bill amount is "+super.totalBill);
		System.out.println("\nPlease select payment mode COD/UPI/Card");
		do
		{
		systemOTP=getOTP();
		System.out.print("\nYour OTP is "+systemOTP);
		System.out.print("\nPlease Enter OTP: ");
		userOTP=scan.nextInt();
		if(systemOTP==userOTP)
			System.out.println("\nYour Order Placed Successfully");
		else
			System.out.println("\nYou entered Incorrect OTP");
		}while(systemOTP!=userOTP);
	scan.close();
	}
	public int getOTP()
	{
		int random=0;
		random=(int)Math.floor(Math.random()*10000);
		return random;
	}
}
