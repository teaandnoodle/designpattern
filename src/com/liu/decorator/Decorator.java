package com.liu.decorator;

public class Decorator implements Component{
	protected Component component = null;
	
	public Decorator(Component component){
		this.component = component;
	}
	@Override
	public void operation() {
		component.operation();
	}

}
