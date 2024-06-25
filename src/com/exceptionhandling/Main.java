package com.exceptionhandling;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		String s=null;
		String num="123";
		System.out.println(Integer.parseInt(num)+123);  
		try {
		System.out.println(s.length());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage()); 
		}
		
			Thread.sleep(1000);
		
		try {
		System.out.println(2/0); 
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("hello");  
	}

}
