package com.liu.mediator;

public class ConcreteColleague2 extends Colleague {

	public ConcreteColleague2(Mediator mediator) {
		super(mediator);
	}

	public void doJob2() {
		System.out.println("Doing Job2...");
	}

}
