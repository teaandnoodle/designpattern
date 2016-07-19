package com.liu.mediator;

public interface Mediator {
	public void initalState();
	public void doChange(Colleague colleague);
	public void show();
}
