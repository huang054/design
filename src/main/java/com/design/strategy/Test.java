package com.design.strategy;

public class Test {

	public static void main(String[] args) {
		ICalculator a = new Mius();
		int i = a.calculator("8-2");
		ICalculator a1 = new Puls();
		int result=a1.calculator("8+2");
		System.out.println(i);
		System.out.println(result);
	}
}
