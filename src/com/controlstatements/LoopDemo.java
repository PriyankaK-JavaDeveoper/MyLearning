package com.controlstatements;

public class LoopDemo {
	public static void main(String[] args)
	{
		int i=1, y=1, z=1;//Initialization
		for(i=1;i<=2;i++)
		{
			System.out.println("FOR LOOP executed "+i);
		}
		while(y<=2) //Condition
		{
			System.out.println("WHILE LOOP executed "+y);
			y++; //Updation
		}
		do
		{
			System.out.println("DO-WHILE LOOP executed "+z);
			z++;
		}while(z<=2);
	}
}
