package com.design.visitor;

public class MyVisitor implements Visitor{

	@Override
	public void visi(Sbuject sbuject) {
		// TODO Auto-generated method stub
		System.out.println(sbuject.getValue());
	}

}
