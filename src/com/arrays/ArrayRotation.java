package com.arrays;

import java.util.Scanner;

public class ArrayRotation {
public static void main(String[] args) 
{
	int a[]= {1,2,3,4,5,6,7};
	int l=a.length;
	int i=0,j=0,n=0;
	int temp[]=new int[l];
	//Scanner scan=new Scanner(System.in);
	Scanner input=new Scanner(System.in);
	System.out.print("Given array: ");
	for(i=0;i<l;i++)
	{
		System.out.print(" "+a[i]);
	}
	System.out.println("\nArray length: "+l);
	System.out.print("Enter no of elements to rotate: ");
	n=input.nextInt();
	for(i=0;i<n;i++)
	{
		temp[i]=a[i];
	}
	i=0;
	while(n<l)
	{
		a[i]=a[n];		
		i++;
		n++;
	}
	j=0;
	while(i<l)
	{
		a[i]=temp[j];
		j++;
		i++;
	}
	System.out.print("Rotated array: ");
	for(i=0;i<l;i++)
	{
		System.out.print(" "+a[i]);
	}
	input.close();
}
}
