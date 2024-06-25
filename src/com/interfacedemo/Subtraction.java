package com.interfacedemo;

public class Subtraction implements InterfaceMathsCalc{

	@Override
	public int calculate() {
		int res=a-b;
		return res;
	}

}
