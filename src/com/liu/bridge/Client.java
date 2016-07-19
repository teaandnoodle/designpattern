package com.liu.bridge;

import org.junit.Test;

public class Client {
	@Test
	public void test() {
		System.setProperty("facotry", "ImpA");
		Abstraction abstraction1 = new RefinedAbstraction();
		abstraction1.operation();
		
		System.setProperty("facotry", "ImpB");
		Abstraction abstraction2 = new RefinedAbstraction();
		abstraction2.operation();
	}
}
