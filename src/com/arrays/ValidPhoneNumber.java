package com.arrays;

import java.util.Scanner;

public class ValidPhoneNumber {
public static void main(String[] args) 
{
	//char ch='3';
	//int a=Integer.parseInt(String.valueOf(ch)); 
	//System.out.println("ch: "+ch+" a: "+a);
	String phone="";
	StringBuilder message=new StringBuilder();
	int l=0;
	int i=0;
	int errcount=0;
	Scanner scan=new Scanner(System.in);
	System.out.print("Please enter mobile number to validate: ");
	phone=scan.next();
	l=phone.length();
	String spclchar="!@#$%^&*()_+{}|<>?:[];'.,/";
	for(i=0;i<l;i++)
	{
	if(phone.contains(spclchar.charAt(i)+""))
	{
		errcount++;
	}
	}
	if(errcount!=0)
	{
		String str1="\nSpecial characters not allowed";
		message=message.append(str1);
	}
	if(errcount==0)
	{
	int phoneNo[]= new int[l];
	for(i=0;i<l;i++)
	{  
		phoneNo[i]=Integer.parseInt(String.valueOf(phone.charAt(i)));     		
	}
	//System.out.print("\nLength of Phone number you entered: "+phoneNo.length);
	if(phoneNo.length>10)
	{
		String str2="\nPhoneNo exceeds maximum of 10 numbers";
		message=message.append(str2);
	}
	if(phoneNo.length<10)
	{
		String str2="\nPhoneNo must contain 10 numbers";
		message=message.append(str2);
	}
	if(!(phoneNo[0]>=6&&phoneNo[0]<=9))
	{
		String str4="\n1st number is not between 6 and 9";
		message=message.append(str4);
	}	
	}
	
	if(!message.isEmpty())
	{
		System.out.println("\nPhone number you entered is not valid for below reasons"+message);
	}
	
	if(message.isEmpty())
	{
		System.out.println("Your phone number is valid");
	} 
	scan.close();	
}
}
