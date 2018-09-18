package com.design.command;

public class Test {

	public static void main(String[] args) {
		Recevier re = new Recevier();
		
		Command com  = new MyCommand(re);
		
		InCommand in = new InCommand(com);
		in.action();
	}
}
