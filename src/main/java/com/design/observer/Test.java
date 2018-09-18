package com.design.observer;

public class Test {

	public static void main(String[] args) {
		Observer o1 = new Observer1();
		Observer o2 = new Observer2();
		
		Subject sub  = new SubjectImpl();
		sub.add(o1);
		sub.add(o2);
		sub.operation();
	}
}
