package com.interfacedemo;

public class Addition implements InterfaceMathsCalc{

	@Override
	public int calculate() {
		int res=a+b;
		return res;
	}

}
