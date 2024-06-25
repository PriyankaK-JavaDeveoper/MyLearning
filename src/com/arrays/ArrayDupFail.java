package com.arrays;

import java.util.Scanner;

public class ArrayDupFail {  
public static void main(String[] args) {
	 	int count=0,n=0;
	 	Scanner scan=new Scanner(System.in);
		
		//Getting total no of array elements
		System.out.print("Enter no of Array elements: ");
		n=scan.nextInt();
		
        int a[] = new int[n]; 
        int dup[]=new int[n];
        
        System.out.print("Enter Array elements: ");
		for(int i=0;i<n;i++)
		{
			a[i]=scan.nextInt();
		} 
        for(int i = 0; i < a.length; i++) 
        {  
            for(int j = (i + 1); j < a.length; j++) 
            {  
                if(a[i] == a[j])  
                {
                    dup[i]=a[j]; 
                    count++;
                }
            }  
        }  
        System.out.print("No of Duplicate elements: "+count);
        System.out.print("\nDuplicate Elements: ");
        for(int i=0;i<count;i++)
    	{
    		System.out.print(" "+dup[i]);
    	}
    }  
}  