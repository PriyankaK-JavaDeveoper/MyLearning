package com.objectsdemo;

public class Product {
int productBill, totalBill, taxtTotal, productTotal=0;
double taxBill=0.0;
String productName1="Dress", productName2="Shoes", productName3="Watch";
int quantity1=10, quantity2=10, quantity3=50;
int amount1=3000, amount2=2000, amount3=1000;
public int purchaseProduct(String productName, int quantity)
{
	switch(productName)
	{
	case "Dress":
	{
		if(this.quantity1>=quantity)
		{
			productBill=quantity*amount1;
			taxBill=getTaxBill(productName, productBill);
			productTotal=productTotal+productBill;
			taxtTotal=(int) (taxtTotal+taxBill);
			totalBill=(int) (productBill+taxBill);
			//totalBill=totalBill+productTotal+taxtTotal;
		}
		else
			System.out.println("Entered quantity for dress is not available");	
	break;
	}
	case "Shoes":
	{
		if(this.quantity2>=quantity)
		{
			productBill=quantity*amount2;
			taxBill=getTaxBill(productName, productBill);
			productTotal=productTotal+productBill;
			taxtTotal=(int) (taxtTotal+taxBill);
			//totalBill=totalBill+productTotal+taxtTotal;
			totalBill=(int) (productBill+taxBill);		
			}
		else
			System.out.println("Entered quantity for Shoes is not available");	
	break;
	}
	case "Watch":
	{
		if(this.quantity3>=quantity)
		{
			productBill=quantity*amount3;
			taxBill=getTaxBill(productName, productBill);
			productTotal=productTotal+productBill;
			taxtTotal=(int) (taxtTotal+taxBill);
			//totalBill=totalBill+productTotal+taxtTotal;
			totalBill=(int) (productBill+taxBill);
		}
		else
			System.out.println("Entered quantity for Watch is not available");	
	break;
	}
	default:
		System.out.println("Product you entered is not available");
	}
return totalBill;
}
public double getTaxBill(String productName, int totalBill)
{
	double taxAmount=0;
	if(productName.equals("Dress"))
		taxAmount=(double)totalBill*0.25;
	if(productName.equals("Shoes"))
		taxAmount=(double)totalBill*0.15;
	if(productName.equals("Watch"))
		taxAmount=(double)totalBill*0.10;
	//System.out.print("Your Tax: "+taxAmount+"\n");
	return taxAmount;
}
}
