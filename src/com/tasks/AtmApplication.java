package com.tasks;
//ATM Application using Control Statements Switch, Loop
import java.util.Scanner;
public class AtmApplication {
public static void main(String [] args) 
{
	int curr_pin=123; //ATM Current Pin
	int total_balance = 10000; //Current Balance
	int choice=0, deposit_amount=0, withdrawal_amount=0;
	int entered_pin=0,new_pin=0;
	Scanner scan = new Scanner(System.in);
	System.out.println("WELCOME TO ATM SERVICES");
	System.out.print("Please Enter Your PIN: ");
	entered_pin=scan.nextInt();
	if(entered_pin==curr_pin)
	{
		do
		{
			System.out.println("\n1. Balance Enquiry\n2. Cash Deposit\n3. Cash Withdraw\n4. PIN Change\n5. Cancel Transaction");
			System.out.print("Please select your choice: ");
			choice=scan.nextInt();
			switch(choice)
			{
			case 1: //Balance Enquiry Code
			{
				System.out.println("\nYour Account Balance is "+total_balance);
				break;
			}
			case 2: // Deposit Amount Code
			{
				System.out.print("Enter amount to deposit: ");
				deposit_amount = scan.nextInt();
				total_balance = total_balance+deposit_amount;
				System.out.println("\nYour Current Balance is "+ total_balance);
				break;
			}	
			case 3: //Withdrawing Amount Code
			{
				System.out.print("Enter amount to withdraw: ");
				withdrawal_amount = scan.nextInt();
				if(withdrawal_amount<=total_balance)
					{
					total_balance = total_balance-withdrawal_amount;
					System.out.println("\nYour Current Balance is "+ total_balance);
					}
				else
					System.out.println("\nInsufficient Balance\nTransaction declined");
				break;
			}
			case 4: // PIN Change Code
			{
				do
				{
				System.out.print("\nPlease Enter Your Old PIN to Change: ");
				entered_pin=scan.nextInt();
				if(entered_pin==curr_pin)
				{
					System.out.print("\nEnter New PIN of Your Choice: ");
					new_pin=scan.nextInt();
					curr_pin=new_pin;
					System.out.println("\nYour PIN has been changed successfully");
				}
				else
				{
					System.out.println("\nYou have entered incorrect Old PIN ");
				}
				}while(curr_pin!=new_pin);
				break;
			}
			default:
				if(choice!=5)
				System.out.println("Please Select Correct Choice: ");
			}
		}while(choice!=5);
		System.out.println("THANK YOU FOR USING OUR ATM");
	}
	else
		System.out.println("You Entered Incorrect PIN");
scan.close();
}
}
