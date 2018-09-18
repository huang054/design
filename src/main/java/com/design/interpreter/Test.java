package com.design.interpreter;

public class Test {

	public static void main(String[] args) {
		int result=new Pus().interpreter(new Context(9, new Abs().interpreter(new Context(6, 3))));
		System.out.println(result);
	}
}
