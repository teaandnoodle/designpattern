package com.liu.bridge;

public abstract class Abstraction {
	protected Implementor imp = null;
	
	public Abstraction(){
		imp = Facotry.getInstance();
	}
	protected Implementor getImplementition(){
		return imp;
	}
	public abstract void operation();
}
