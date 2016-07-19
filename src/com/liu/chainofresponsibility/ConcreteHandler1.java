package com.liu.chainofresponsibility;

public class ConcreteHandler1 extends Handler{

	public ConcreteHandler1(Handler successor, boolean isHelp) {
		super(successor, isHelp);
	}
	public void handleRequest() {
		if (hasHelp()) {
			System.out.println("Many help!");
		} else {
			super.handleRequest();
		}
	}
}
