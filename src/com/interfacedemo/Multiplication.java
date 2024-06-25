package com.interfacedemo;

public class Multiplication implements InterfaceMathsCalc{

	@Override
	public int calculate() {
		int res=a*b;
		return res;
	}

}
