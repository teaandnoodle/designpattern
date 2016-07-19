package com.liu.decorator;

public class ConcreteDecoratorA extends Decorator{

	private String addedState = null;
	
	public ConcreteDecoratorA(Component component) {
		super(component);
		addedState = "Initialed";
	}

	public void operation(){
		super.operation();
		System.out.println(String.format("Also change state! From %s to Operated.", addedState));
		addedState = "Operated";
	}
}
