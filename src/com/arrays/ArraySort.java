package com.arrays;

public class ArraySort {
public static void main(String[] args) 
	{
	int a[]= {10,20,10,10,20,30};
	//int b[]=new int[7];
	int i=0,j=0;
	System.out.print("Given array: ");
	for(i=0;i<a.length;i++)
	{
		System.out.print(" "+a[i]);
	}
	for(i=0;i<a.length;i++)
	{
		for(j=i;j<a.length;j++)
		{
			/*if(a[i]<a[j])
			{
				a[i]=a[i];
				System.out.println("a in if "+a[i]);
			}*/
			if(a[i]>a[j])//(a[i]=20) > (a[j]=10)
			{
				int c=a[i];
				a[i]=a[j];
				a[j]=c;
				//System.out.println("a in else "+a[i]);
			}
		}
	}
	System.out.print("\nSorted array: ");
	for(int c=0;c<a.length;c++)
		System.out.print(" "+a[c]);
	}
}
