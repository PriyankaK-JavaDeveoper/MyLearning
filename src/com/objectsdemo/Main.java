package com.objectsdemo;
import java.util.Scanner;
public class Main {
	public static void main(String[] args)
	{
		Product product=new Product();
		String productName;
		int quantity, totalBill=0,choice=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("WELCOME TO SHOPPING CART");
		System.out.print(product.productName1+" Rs: "+product.amount1+"\n");
		System.out.print(product.productName2+" Rs: "+product.amount2+"\n");
		System.out.print(product.productName3+" Rs: "+product.amount3+"\n");
		do
		{
		System.out.print("Please Enter Product Name: ");
		productName=scan.next();
		System.out.print("Please Enter Quantity: ");
		quantity=scan.nextInt();
		totalBill=totalBill+product.purchaseProduct(productName, quantity);
		System.out.print("Press 1 to add another product to cart\nPress 2 to calculate Bill ");
		choice=scan.nextInt();
		}while(choice!=2);
		System.out.println("\nYour Product Total Amount: "+product.productTotal);
		System.out.println("Your Tax Amount: "+product.taxtTotal);
		System.out.println("Your Total Bill: "+totalBill);
	scan.close();
	}
}
 