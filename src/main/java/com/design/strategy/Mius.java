package com.design.strategy;

public class Mius extends AbstractCalculator implements ICalculator{

	@Override
	public Integer calculator(String str) {
		// TODO Auto-generated method stub
		int[] ints=this.spit(str, "-");
		return ints[0]-ints[1];
	}

}
