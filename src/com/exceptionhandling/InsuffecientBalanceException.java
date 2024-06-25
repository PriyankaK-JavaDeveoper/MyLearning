package com.exceptionhandling;

public class InsuffecientBalanceException extends Exception{

	public InsuffecientBalanceException(String message)
	{
		super(message); 
	}
}
