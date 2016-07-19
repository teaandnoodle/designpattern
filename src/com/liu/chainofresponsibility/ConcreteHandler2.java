package com.liu.chainofresponsibility;

public class ConcreteHandler2 extends Handler{

	public ConcreteHandler2(Handler successor, boolean isHelp) {
		super(successor, isHelp);
	}
	public void handleRequest() {
		if (hasHelp()) {
			System.out.println("Little help!");
		} else {
			super.handleRequest();
		}
	}
}
