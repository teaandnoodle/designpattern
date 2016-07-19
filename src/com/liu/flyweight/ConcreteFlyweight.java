package com.liu.flyweight;

public class ConcreteFlyweight implements Flyweight{
	private Flyweight intrinsicState = null;
	private Flyweight left = null;
	private Flyweight right = null;
	
	public ConcreteFlyweight(String value){
		intrinsicState = FlyweightFactory.getFlyweight(value);
	}
	@Override
	public String operation() {
		StringBuilder ss = new StringBuilder(intrinsicState.operation());
		if(left != null) ss.append(left.operation());
		if(right != null) ss.append(right.operation());
		return ss.toString();
	}
	
	@Override
	public void setLeft(Flyweight node) {
		left = node;
	}
	@Override
	public void setRight(Flyweight node) {
		right = node;
	}
	@Override
	public Flyweight getLeft() {
		return left;
	}
	@Override
	public Flyweight getRight() {
		return right;
	}
}
