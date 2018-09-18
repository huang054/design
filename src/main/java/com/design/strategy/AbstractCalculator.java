package com.design.strategy;

public abstract class AbstractCalculator {

	public int[] spit(String str,String lex) {
		String[] arr=str.split(lex);
		int[] ints = new int[2];
		ints[0]=Integer.parseInt(arr[0]);
		ints[1]=Integer.parseInt(arr[1]);
		return ints;
	}
}
