package com.interfacedemo;

public class Division implements InterfaceMathsCalc, TestInterface{

	@Override
	public int calculate() {
		int res=a/b;
		return res;
	}

}
