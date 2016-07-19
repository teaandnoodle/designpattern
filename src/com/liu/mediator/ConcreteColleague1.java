package com.liu.mediator;

public class ConcreteColleague1 extends Colleague{

	public ConcreteColleague1(Mediator mediator) {
		super(mediator);
	}
	
	public void doJob1(){
		System.out.println("Doing Job1...");
	}

}
