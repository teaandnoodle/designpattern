package com.liu.observer;

public class ConcreteObserver implements Observer {

	private Subject subject = null;

	public ConcreteObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update(Subject subject) {
		if (this.subject == subject) {
			System.out.println("Update myself(" + this + ") and do other things!");
		}
	}

}
