package com.design.templateMethod;

public class Test {

	public static void main(String[] args) {
		AbstractCalculator ab = new Calculator();
		int result=ab.calulator("8+2", "\\+");
		System.out.println(result);
	}
}
