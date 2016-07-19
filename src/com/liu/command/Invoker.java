package com.liu.command;

public class Invoker {
	private Command command = null;
	public void addCmd(Command command) {
		this.command = command;
	}
	public void doJob(){
		command.execute();
	}
}
