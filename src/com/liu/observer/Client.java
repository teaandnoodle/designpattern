package com.liu.observer;

import org.junit.Test;

public class Client {
	@Test
	public void test() {
		// create a subject
		Subject subject = new ConcreteSubject();
		// create two observers that subscribe the subject
		@SuppressWarnings("unused")
		Observer observer1 = new ConcreteObserver(subject);
		@SuppressWarnings("unused")
		Observer observer2 = new ConcreteObserver(subject);
		// subject state changed and notify all these observers
		subject.observerNotify();
	}

	@Test
	public void testJava() {
		SubjectJava subject = new SubjectJava();
		ObserverJava observer1 = new ObserverJava();
		subject.addObserver(observer1);

		subject.setState("A");
		subject.setState("B");
		subject.setState("C");
	}
}
