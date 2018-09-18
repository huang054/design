package com.design.factory;

public class Pig implements Provider{

	@Override
	public Animals product() {
		// TODO Auto-generated method stub
		return new PigSay();
	}

}
