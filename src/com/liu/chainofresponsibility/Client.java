package com.liu.chainofresponsibility;

import org.junit.Test;

public class Client {

	@Test
	public void test() {
		ConcreteHandler1 h1 = new ConcreteHandler1(null, true);
		ConcreteHandler1 h2 = new ConcreteHandler1(h1, true);
		h2.handleRequest();
		
		ConcreteHandler2 h3 = new ConcreteHandler2(null, true);
		ConcreteHandler2 h4 = new ConcreteHandler2(h3, true);
		h4.handleRequest();
		
		ConcreteHandler1 h5 = new ConcreteHandler1(null, true);
		ConcreteHandler2 h6 = new ConcreteHandler2(h5, false);
		h6.handleRequest();
		
		ConcreteHandler1 h7 = new ConcreteHandler1(null, false);
		ConcreteHandler2 h8 = new ConcreteHandler2(h7, true);
		h8.handleRequest();
	}
}
