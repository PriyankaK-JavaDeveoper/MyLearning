package com.inheritance;
import java.util.Scanner;
//Used Concepts Hybrid Inheritance
public class Admin extends ProductsList{
	public Admin()
	{
		super.displayAll();
	}
	public void updateProductDetails()
	{
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		do
		{
		System.out.print("\nPress 1 to logout\nPress 2 to update Product Details");
		choice=scan.nextInt();
		if(choice==2)
		{
		System.out.println("\nPlease Enter Product Details to Update");
		System.out.print("Product Name: ");
		String productName = scan.next();
		System.out.print("Quantity: ");
		int quantity=scan.nextInt();
		System.out.print("Price: ");
		int price=scan.nextInt();
		setProductDetails(productName, quantity, price);
		System.out.println("\nProduct Details are updated successfully");
		}
		}while(choice!=1);
		System.out.println("\nYou logged out successfully");
	scan.close();
	}
	public void setProductDetails(String productName, int quantity, int price)
	{
		if(productName.equals(product1))
		{
			quantity1=quantity;
			price1=price;
		}
		if(productName.equals(product2))
		{
			quantity2=quantity;
			price2=price;
		}
		if(productName.equals(product3))
		{
			quantity3=quantity;
			price3=price;
		}
		else
		{
		System.out.println("Please Enter correct Product name");
		}
	}
}
