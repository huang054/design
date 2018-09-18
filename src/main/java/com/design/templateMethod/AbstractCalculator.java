package com.design.templateMethod;

public abstract class AbstractCalculator {
	
	public int[] spit(String str,String lex) {
		String[] arr=str.split(lex);
		int[] ints = new int[2];
		ints[0]=Integer.parseInt(arr[0]);
		ints[1]=Integer.parseInt(arr[1]);
		return ints;
	}

	public abstract Integer calulator(int num1,int num2);
	
	public final Integer calulator(String str,String lex) {
		int[] ints=spit(str, lex);
		return calulator(ints[0], ints[1]);
	}
}
