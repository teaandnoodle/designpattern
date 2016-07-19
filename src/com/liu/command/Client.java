package com.liu.command;

import org.junit.Test;

public class Client {
	@Test
	public void test() {
		//create a command and set it's receiver
		Receiver receiver = new Receiver();
		Command cmd = new ConcreteCommand(receiver);

		//link command with invoker
		Invoker invoker = new Invoker();
		invoker.addCmd(cmd);
		//...do a lot of job
		invoker.doJob();
	}
}
