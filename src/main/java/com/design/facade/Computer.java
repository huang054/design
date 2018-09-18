package com.design.facade;

public class Computer {

	private Cpu cpu;
	
	private Memory memory;
	
	private Disk disk;
	
	public Computer(Cpu cpu,Memory memory,Disk disk) {
		this.cpu=cpu;
		this.memory=memory;
		this.disk=disk;
	}
	
	public void start() {
		cpu.start();
		memory.start();
		disk.start();
	}
	
	public void shutdown() {
		disk.shutdown();
		memory.shutdown();
		cpu.shutdown();
	}
}
