package com.design.command;

public class InCommand {

private Command command;
	
	public InCommand(Command command) {
		this.command = command;
	}

	public void action(){
		command.exe();
	}
}
