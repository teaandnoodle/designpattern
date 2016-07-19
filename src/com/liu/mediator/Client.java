package com.liu.mediator;

import org.junit.Test;

public class Client {
	@Test
	public void test(){
		Mediator mediator = new ConcreteMediator();
		mediator.initalState();
		mediator.show();
	}
}
