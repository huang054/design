package com.design.chainOfResponsibility;

public class Test {

	public static void main(String[] args) {
		MyHandler ha1 = new MyHandler("A");
		MyHandler ha2 = new MyHandler("B");
		MyHandler ha3 = new MyHandler("C");
		ha1.setHandler(ha2);
		ha2.setHandler(ha3);
		ha1.operation();
	}
}
