package com.design.decorator;

public class Decorator implements Eat{
    private Eat eat;
    
    public Decorator(Eat eat) {
    	this.eat=eat;
    }
    
    public void eat() {
    	System.out.println("cookie");
    	eat.eat();
    	System.out.println("wash");
    }
}
