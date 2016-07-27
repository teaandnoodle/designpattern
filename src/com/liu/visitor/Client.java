package com.liu.visitor;

import org.junit.Test;

public class Client {
	@Test
	public void test(){
		ConcreteElementA elemA = new ConcreteElementA();
		ConcreteElementB elemB = new ConcreteElementB();
		
		//test1
		Visitor v1 = new ConcreteVisitor1();
		elemA.accept(v1);
		elemB.accept(v1);
		//test2
		Visitor v2 = new ConcreteVisitor2();
		elemA.accept(v2);
		elemB.accept(v2);
		//test3
		Visitor visitor = new ObjectStructureVisitor();
		ObjectStructure struct = new ObjectStructure();
		struct.addElement(elemA);
		struct.addElement(elemB);
		
		struct.accept(visitor);
		//test4
		elemA.accept(visitor);
		elemB.accept(visitor);
	}
}