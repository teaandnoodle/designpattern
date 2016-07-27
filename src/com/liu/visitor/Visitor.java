package com.liu.visitor;

public class Visitor {
	public void VisitElementA(ConcreteElementA element) {
		throw new RuntimeException("Not support!");
	}

	public void VisitElementB(ConcreteElementB element) {
		throw new RuntimeException("Not support!");
	}

	public void VisitObjectStructure(ObjectStructure element) {
		throw new RuntimeException("Not support!");
	}
}
