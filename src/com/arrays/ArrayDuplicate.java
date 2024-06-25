package com.arrays;

import java.util.Scanner;

public class ArrayDuplicate {

	public static void main(String[] args) {
		int n=0,dupcount=0,i=0,j=0;
		Scanner scan=new Scanner(System.in);
		
		//Getting total no of array elements
		System.out.print("Enter no of Array elements: ");
		n=scan.nextInt();
		
		int a[]=new int[n];
		int dup[]= new int[n];
		
		System.out.print("Enter Array elements: ");
		for(i=0;i<n;i++)
		{
			a[i]=scan.nextInt();
		} 
		
		/*for(i=0;i<n;i++)
		{
			for(j=(i+1);j<n;j++)
			{
				if(a[i]==a[j])
				{
				dup[k]=a[i];
				k++;	
				dupcount++;
				}
			}
		}*/
	for(i=0;i<n;i++)
	{
		for(j=i;j<n;j++)
		{
			if(a[i]>a[j])
			{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			}
		}
	}
	
	System.out.print("Sorted Array: ");
	for(i=0;i<a.length;i++)
	{
		System.out.print(a[i]+" ");
	}
	System.out.println();
	/*int k=0;j=1;
	for(i=0;i<n&&j<n;i++)
	{
		if(a[i]!=a[j])
		{
			dup[k]=a[i];
			k++;
			dupcount++;
		}
		j++;
	}*/
	i=0;j=1;
	int k=0,count=0;
	while(i<n&&j<n)
	{
		while(a[i]==a[j])
		{
		count++;
		i++;j++;
		}
		if(count!=0)
		{
			dup[k]=a[i];
			k++;
			dupcount++;
		}
		i=j;j=j+1;count=0;
	}
	System.out.println("\nNo of Duplicates in Array: "+dupcount);
	System.out.print("Duplicated elements: ");
	for(i=0;i<dupcount;i++)
	{
		System.out.print(" "+dup[i]);
	}
	System.out.print("\nNot Duplicated Elements: ");
	
	for(i=0;i<n;i++)
	{
		j=0;
		while(j<dupcount)
		{
		if(a[i]==dup[j]) 
		{
		a[i]=0;
		}
		j++;
		}
	}
	for(i=0;i<a.length;i++)
	{
		if(a[i]!=0)
		System.out.print(a[i]+" ");
	}
}
}
