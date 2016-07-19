package com.liu.flyweight;

public interface Flyweight {
	public String operation();
	public void setLeft(Flyweight node);
	public void setRight(Flyweight node);
	public Flyweight getLeft();
	public Flyweight getRight();
}
