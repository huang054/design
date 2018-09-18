package com.design.visitor;

public class MySbuject implements Sbuject{

	@Override
	public void accpect(Visitor visi) {
		// TODO Auto-generated method stub
		visi.visi(this);
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return "hello world";
	}

}
