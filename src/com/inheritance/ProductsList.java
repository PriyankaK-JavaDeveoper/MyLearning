package com.inheritance;
//Used concepts Static Variables and Static Methods
public class ProductsList 
{
	String product1="Pendrive", product2="Phone", product3="Laptop";
	int quantity1=50,quantity2=10,quantity3=20;
	int price1=700,price2=20000,price3=25000;
	public void displayProductList()
	{
		System.out.println("\nAvailable Products and Price");
		System.out.println("\n"+product1+": "+price1);
		System.out.println(product2+": "+price2);
		System.out.println(product3+": "+price3);
	}
	public void displayAll()
	{
		System.out.println("\nAvailable Products and Quanity");
		System.out.println("\n"+product1+": "+quantity1+" available "+"Rs. "+price1+"per unit");
		System.out.println(product2+": "+quantity2+" available "+"Rs. "+price2+"per unit");
		System.out.println(product3+": "+quantity3+" available "+"Rs. "+price3+"per unit");
	}
}
