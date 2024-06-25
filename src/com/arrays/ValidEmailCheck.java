package com.arrays;

import java.util.Scanner;

public class ValidEmailCheck {
public static void main(String[] args) {
	String email="";
	int i=0,errcount=0;
	Scanner scan=new Scanner(System.in);
	System.out.print("Please enter email to validate: ");
	email=scan.next();
	StringBuilder errMessage=new StringBuilder();
	if(!email.contains("@"))
	{
		String str1 ="\nEmail must contain atleast one '@' symbol";
		errMessage.append(str1);
	}
	char emailArray[]=email.toCharArray();
	for(i=0;i<email.length();i++)
	{
		if(emailArray[i]=='.')
		{
			errcount++;
		}
	}
	if(!(errcount>=1&&errcount<=3))
	{
		String str2="\nEmail must contains only 1 to 3 '.' Symbol ";
		errMessage.append(str2);
	}
	if(errMessage.isEmpty())
		System.out.println("\nYour email is valid");
	if(!errMessage.isEmpty())
		System.out.println("\nYour mail is not valid for below reasons\n"+errMessage);
	scan.close();
}
}