package com.liu.visitor;

public class ConcreteVisitor2 extends Visitor {

	public void VisitElementA(ConcreteElementA element) {
		System.out.println("Using ConcreteVisitor2 visit ConcreteElementA");
		element.operationA();
	}

	public void VisitElementB(ConcreteElementB element) {
		System.out.println("Using ConcreteVisitor2 visit ConcreteElementB");
		element.operationB();
	}
}
