package com.liu.mediator;

public class ConcreteMediator implements Mediator{

	private ConcreteColleague1 colleague1 = null;
	private ConcreteColleague2 colleague2 = null;
	@Override
	public void initalState() {
		colleague1 = new ConcreteColleague1(this);
		colleague2 = new ConcreteColleague2(this);
	}

	@Override
	public void doChange(Colleague colleague) {
		if(colleague == colleague1){
			colleague1.doJob1();
			System.out.println("Do other changes in mediator");
		} else if(colleague == colleague2){
			colleague2.doJob2();
		}
	}

	@Override
	public void show() {
		colleague1.changed();
		colleague2.changed();
	}

}
