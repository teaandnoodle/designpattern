package com.liu.visitor;

public class ObjectStructureVisitor extends Visitor {

	public void VisitElementA(ConcreteElementA element) {
		element.operationA();
	}

	public void VisitElementB(ConcreteElementB element) {
		element.operationB();
	}
	public void VisitObjectStructure(ObjectStructure element) {
		System.out.println("Using ObjectStructureVisitor visit ObjectStructure");
	}
}
