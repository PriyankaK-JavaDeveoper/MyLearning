package com.inheritance;
//Used concepts:Private Constructor, Data Encapsulation, Static
public class LoginAccount {
	private static String customerUserName="Priyanka";
	private static String customerPassword="priya@123";
	private static String adminUserName="Admin";
	private static String adminPassword="admin@123";
	private LoginAccount()
	{
		
	}
	public static String getcustomerUserName()
		{
		return customerUserName;
		}
	
	public static String getcustomerPassword()
	{
	return customerPassword;
	}
	public static String getadminUserName()
	{
	return adminUserName;
	}

	public static String getadminPassword()
	{
	return adminPassword;
	}
}
