package com.design.visitor;

public class Test {

	public static void main(String[] args) {
		Sbuject sbu = new MySbuject();
		Visitor visi = new MyVisitor();
		sbu.accpect(visi);
	}
}
