package com.liu.templatemethod;

public class ConcreteClass extends AbstractClass{

	@Override
	protected void primitiveOperation1() {
		System.out.println("Do Operation1!");
	}

	@Override
	protected void primitiveOperation2() {
		System.out.println("Do Operation2!");
	}

}
