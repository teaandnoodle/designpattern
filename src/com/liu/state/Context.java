package com.liu.state;

public class Context {
	private State state = null;

	public Context(State state) {
		this.state = state;
	}

	public void changeState(State state) {
		this.state = state;
	}

	public void request() {
		state.handle(this);
	}
}
