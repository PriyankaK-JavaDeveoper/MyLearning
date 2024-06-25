package com.inheritance;
import java.util.Scanner;
public class InheritanceMain {
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("\nWELCOME TO OUR SHOPPING SITE");
		System.out.println("\nPress 1 for Admin\nPress 2 for Customer: ");
		int choice=scan.nextInt();
		if(choice==1)
		{
		String userName=LoginAccount.getadminUserName();
		String password=LoginAccount.getadminPassword();
		System.out.print("Please enter User Name: "); 
		String inputName=scan.next();
		System.out.print("Please enter few characters of old password: ");
		String inputPassword=scan.next();
		if(userName.equals(inputName)&&password.contains(inputPassword))
			{
			Admin admin=new Admin();
			admin.updateProductDetails();
			}
		else
			System.out.println("\nPlease enter correct login details");
		}
		if(choice==2)
		{
		String userName=LoginAccount.getcustomerUserName();
		String password=LoginAccount.getcustomerPassword();
		System.out.print("Please enter User Name: "); 
		String inputName=scan.next();
		System.out.print("Please enter few characters of old password: ");
		String inputPassword=scan.next();
		if(userName.equals(inputName)&&password.contains(inputPassword))
			{
			PlaceOrder placeOrder = new PlaceOrder();
			placeOrder.paymentMethod();
			}
		else
			System.out.println("\nPlease enter correct login details");
		}
	scan.close();
	}
}
