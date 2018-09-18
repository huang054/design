package com.design.decorator;

public class Test {
   public static void main(String[] args) {
	Eat eat = new EatImpl();
	Eat eat1 = new Decorator(eat);
	eat.eat();
	eat1.eat();
}
}
