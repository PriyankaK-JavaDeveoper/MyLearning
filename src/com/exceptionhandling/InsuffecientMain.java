package com.exceptionhandling;

import java.util.Scanner;

public class InsuffecientMain {

	public static void main(String[] args) {
		
		int amount=1000;
		int cash=0;
		Scanner scan=new Scanner(System.in);
		cash=scan.nextInt();
		if(cash<=amount)
		{
			System.out.println("Please take your cash");
		}
		else
		{
			try {
			throw new InsuffecientBalanceException("Insuffecient Balance");
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
			}
	}

}
