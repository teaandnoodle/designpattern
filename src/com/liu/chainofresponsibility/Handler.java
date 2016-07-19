package com.liu.chainofresponsibility;

public class Handler {
	private Handler successor = null;
	private boolean isHelp = false;

	public Handler(Handler successor, boolean isHelp) {
		this.successor = successor;
		this.isHelp = isHelp;
	}

	public void handleRequest() {
		if (successor != null) {
			successor.handleRequest();
		}
	}

	public boolean hasHelp() {
		return isHelp;
	}
}
