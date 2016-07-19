package com.liu.observer;

import java.util.HashSet;
import java.util.Set;

public class ConcreteSubject implements Subject {
	private Set<Observer> observers = null;

	public ConcreteSubject() {
		observers = new HashSet<>();
	}

	public void attach(Observer observer) {
		observers.add(observer);
	}

	public void detach(Observer observer) {
		observers.remove(observer);
	}

	public void observerNotify() {
		for (Observer o : observers) {
			o.update(this);
		}
	}

}
