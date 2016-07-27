package com.liu.state;

import org.junit.Test;

public class Client {
	@Test
	public void test() {
		Context context = new Context(ConcreteStateA.instance());
		context.request();
		context.changeState(ConcreteStateB.instance());
		context.request();
	}
}
