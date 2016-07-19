package com.liu.decorator;

public class ConcreteDecoratorB extends Decorator{

	public ConcreteDecoratorB(Component component) {
		super(component);
	}

	public void operation(){
		super.operation();
		addedBehavior();
	}
	private void addedBehavior(){
		System.out.println("Another behavior added!");
	}
}
