package com.design.command;

public class MyCommand implements Command{

	private Recevier recevier;
	
	public MyCommand(Recevier recevier) {
		// TODO Auto-generated constructor stub
		this.recevier=recevier;
	}
	@Override
	public void exe() {
		// TODO Auto-generated method stub
		recevier.action();
		
	}

}
