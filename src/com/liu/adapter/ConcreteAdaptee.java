package com.liu.adapter;

public class ConcreteAdaptee implements Adaptee{
	@Override
	public void specificRequest() {
		System.out.println("Do sth in Adaptee!");
	}
}
