package com.liu.flyweight;

public class UnsharedConcreteFlyweight implements Flyweight{
	private String allState = null;
	
	public UnsharedConcreteFlyweight(String value){
		allState = value;
	}
	@Override
	public String operation() {
		return allState;
	}
	@Override
	public void setLeft(Flyweight node) {
		
	}
	@Override
	public void setRight(Flyweight node) {
		
	}
	@Override
	public Flyweight getLeft() {
		return null;
	}
	@Override
	public Flyweight getRight() {
		return null;
	}
}
