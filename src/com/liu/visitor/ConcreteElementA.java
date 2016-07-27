package com.liu.visitor;

public class ConcreteElementA implements Element {

	@Override
	public void accept(Visitor visitor) {
		visitor.VisitElementA(this);
	}

	public void operationA() {
		System.out.println("Do operationA!");
	}

}
