package com.design.bridge;

public class Test {

	public static void main(String[] args) {
		Source source1 = new SourceAble1();
		Source source2 = new SourceAble2();
		Birdge birdge = new BirdgeImpl();
		birdge.setSource(source1);
		birdge.source();
		birdge.setSource(source2);
		birdge.source();
		
	}
}
