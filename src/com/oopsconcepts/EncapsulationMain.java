package com.oopsconcepts;
import java.util.Scanner;
public class EncapsulationMain {
public static void main(String args[])
	{
	Encapsulation encapsulation = new Encapsulation();
	Scanner scan=new Scanner(System.in);
	String userName=encapsulation.getuserName();
	String password=encapsulation.getpassword();
	String setName,setPassword;
	System.out.print("Please enter User Name: ");
	String inputName=scan.next();
	System.out.print("Please enter few characters of old password: ");
	String inputPassword=scan.next();
	if(userName.equals(inputName)&&password.contains(inputPassword))
		{
		System.out.print("Please enter new user name to update: ");
		setName=scan.next();
		System.out.print("Please enter new password to update: ");
		setPassword=scan.next();
		encapsulation.setUserName(setName);
		encapsulation.setpassword(setPassword);
		System.out.println("\nYour new Credentials are below");
		System.out.println("User Name: "+encapsulation.getuserName());
		System.out.println("Password: "+encapsulation.getpassword());
		}
	else
		System.out.println("Please enter correct user name");
	scan.close();
	}
}
