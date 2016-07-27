package com.liu.visitor;

public class ConcreteVisitor1 extends Visitor {

	public void VisitElementA(ConcreteElementA element) {
		System.out.println("Using ConcreteVisitor1 visit ConcreteElementA");
	}

	public void VisitElementB(ConcreteElementB element) {
		System.out.println("Using ConcreteVisitor1 visit ConcreteElementB");
	}
}
