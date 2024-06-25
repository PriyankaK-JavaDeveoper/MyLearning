package com.tasks;
import java.util.Scanner;
public class GetCaptacha 
{
public static void main(String args[])
{
	String generatedCaptacha, enteredCaptacha;
	Scanner scan = new Scanner(System.in);
	do
	{
	generatedCaptacha=getCaptacha();
	System.out.println("Captacha is "+generatedCaptacha);
	System.out.print("Please Enter the above Captacha: ");
	enteredCaptacha=scan.next();
	if(generatedCaptacha.equals(enteredCaptacha))
		System.out.println("You are successfully loggedin");
	else
		System.out.println("Entered Captacha is wrong");
	}while(!generatedCaptacha.equals(enteredCaptacha));
scan.close();
}
public static String getCaptacha()
{
	String captacha=""; 
	String letters="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	int randomNumber=(int)Math.floor(Math.random()*10000);
	int pickCharacter=(int)Math.floor(Math.random()*10);
	char customLetter=letters.charAt(pickCharacter);
	captacha=randomNumber+""+customLetter;
	return captacha;
}
} 
