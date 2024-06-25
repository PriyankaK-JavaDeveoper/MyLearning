package com.inheritance;
import java.util.Scanner;
//Used Concepts Single Inheritance
public class AddCart extends ProductsList{
String productName;
int quantity, choice=1, totalBill;
public void addCart()
{
	Scanner scan=new Scanner(System.in);
	do
	{
	if(choice==1)
	{
	//Add cart code
	System.out.print("\nPlease Enter Product Name: ");
	productName=scan.next();
	System.out.print("Please Enter Quantity: ");
	quantity=scan.nextInt();
	totalBill=totalBill+calculateBill(productName,quantity);
	}
	System.out.print("\nPress 1 to add more product to cart\nPress 2 to place order");
	choice=scan.nextInt();
	}while(choice!=2);
	scan.close();
}
public int calculateBill(String productName, int quantity)
{
	int total=0;
	
	switch(productName)
	{
		case "Pendrive":
		{
		if(super.quantity1>=quantity)
		{
		total=quantity*super.price1;
		}
		else
			System.out.println("Entered quantity for Pendrive is not available");
		break;
		}
		case "Phone":
		{
		if(super.quantity2>=quantity)
		{
		total=quantity*super.price2;
		}
		else
			System.out.println("Entered quantity for Phone is not available");
		break;
		}
		case "Laptop":
		{
		if(super.quantity3>=quantity)
		{
		total=quantity*super.price3;
		}
		else
			System.out.println("Entered quantity for Laptop is not available");
		break;
		}
	}
	return total;
}

}