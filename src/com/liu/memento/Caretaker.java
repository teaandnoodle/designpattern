package com.liu.memento;

public class Caretaker {
	Memento memento = null;

	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}
}
