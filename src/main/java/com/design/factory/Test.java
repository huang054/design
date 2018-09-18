package com.design.factory;

public class Test {
	public static void main(String[] args) {
		Provider provider = new Dog();
		Animals animal = provider.product();
		animal.say();
	}

}
