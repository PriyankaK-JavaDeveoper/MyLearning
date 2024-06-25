package com.helloworld;

public class Hello {
	public static void main(String [] args)
	{
		System.out.println("Hello World");
		byte a = (byte)128; //Explicit casting or narrow casting;
		System.out.println(a);
		short b = 125;
		int c=b;
		System.out.println(c); // Implicit casting or widening casting;
	}
}

