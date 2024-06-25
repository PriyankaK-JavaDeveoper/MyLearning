package com.arrays;
import java.util.Scanner;
public class ArrayTotal {
public static void main(String[] args) {
	//int a[]= {10,20,30,40,50};
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter length of array: ");
	int n=scan.nextInt();
	int a[]=new int[n];
	System.out.print("Enter "+n+" array element: ");
	for (int k=0;k<n;k++)
	{
		a[k]=scan.nextInt();
	}
	scan.close();
	int i=0,total = 0;
	for(i=0;i<a.length;i++) {
		total=total+a[i];
	}
	System.out.println("Total of Array Elements: "+total);
}
}
