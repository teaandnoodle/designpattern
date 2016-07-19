package com.liu.memento;

public class Originator {
	private String state;

	public void changeState(String state) {
		System.out.println(String.format("Change to %s, the original state is %s", state, this.state));
		this.state = state;
	}

	public void setMemento(Memento m) {
		state = m.getState();
	}

	public Memento createMemento() {
		return new Memento(state);
	}
}
