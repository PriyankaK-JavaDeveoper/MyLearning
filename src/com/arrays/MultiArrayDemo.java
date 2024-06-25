package com.arrays;

public class MultiArrayDemo {
public static void main(String[] args) 
 {
	int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
	int i=0,j=0;
	System.out.println("Given Matrix length: "+a.length);
	for(i=0;i<a.length;i++)
	{
		for(j=0;j<a[i].length;j++)
		{
			System.out.print(a[i][j]+" ");
		}
	System.out.println();
	}
	for(i=0;i<a.length;i++)
	{
		for(j=i;j<a[i].length;j++)
		{
			int temp=a[i][j];
			a[i][j]=a[j][i];
			a[j][i]=temp;
		}
	}
	System.out.println("\nTransposed Matrix");
	for(i=0;i<a.length;i++)
	{
		for(j=0;j<a[i].length;j++)
		{
			System.out.print(a[i][j]+" ");
		}
	System.out.println();
	}
 }
}
