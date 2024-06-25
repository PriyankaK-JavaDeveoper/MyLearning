package com.polymorphism;

public class SBI implements RBI{

	@Override
	public void rateofInterest() {
		System.out.println("\nSBI Rate of Interest for FD is "+"7%");
		System.out.println("SBI Rate of Interest for Gold Loan is "+"8%");
		System.out.println("SBI Rate of Interest for Home Loan is "+"12%");
	}

}
