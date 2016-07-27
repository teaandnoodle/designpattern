package com.liu.visitor;

public class ConcreteElementB implements Element {

	@Override
	public void accept(Visitor visitor) {
		visitor.VisitElementB(this);
	}

	public void operationB() {
		System.out.println("Do operationB!");
	}
}
