package com.design.factory;

public class Dog implements Provider{

	@Override
	public Animals product() {
		// TODO Auto-generated method stub
		return new DogSay();
	}

}
