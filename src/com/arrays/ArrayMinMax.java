package com.arrays;

public class ArrayMinMax {

	public static void main(String[] args) {
		int a[]= {20,50,30,10,60,40,15,65,85,45};
		//int b[]=new int[7];
		int i=0, min=a[0],max=a[0];
		System.out.print("Given array: ");
		for(i=0;i<a.length;i++)
		{
			System.out.print(" "+a[i]);
		}
		for(i=1;i<a.length;i++)
		{
				if(a[i]>max)
				{
					max=a[i];
				}
		} 
		for(i=1;i<a.length;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}	
		}
		System.out.print("\nMinimum Number: "+min);
		System.out.print("\nMaximum Number: "+max);
	}
}
