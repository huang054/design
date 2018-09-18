package com.design.interpreter;

public class Abs implements Expression{

	@Override
	public int interpreter(Context contect) {
		// TODO Auto-generated method stub
		return contect.getNum1()-contect.getNum2();
	}

}
