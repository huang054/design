package com.design.facade;

public class Test {

	public static void main(String[] args) {
		Computer computer = new Computer(new Cpu(), new Memory(), new Disk());
		computer.start();
		computer.shutdown();
	}
}
