package com.liu.strategy;

import org.junit.Test;

public class Client {
	@Test
	public void test() {
		Strategy stA = new ConcreteStrategyA();
		Strategy stB = new ConcreteStrategyB();
		Strategy stC = new ConcreteStrategyC();
		
		int a = 1, b = 2;
		Context context = new Context(stA);
		context.contextInterface(a, b);
		
		context.changeStrategy(stB);
		context.contextInterface(a, b);
		
		context.changeStrategy(stC);
		context.contextInterface(a, b);
	}
}
