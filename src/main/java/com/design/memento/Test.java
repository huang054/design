package com.design.memento;

public class Test {

	public static void main(String[] args) {
		Bigen bigen = new Bigen("first");
		End end = new End(bigen.init());
		System.out.println(bigen.getName());
		bigen.setName("second");
		System.out.println(bigen.getName());
		bigen.reseat(end.getSave());
		System.out.println(bigen.getName());
	}
}
