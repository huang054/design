package com.design.interpreter;

public class Pus implements Expression{

	@Override
	public int interpreter(Context contect) {
		// TODO Auto-generated method stub
		return contect.getNum1()+contect.getNum2();
	}

}
