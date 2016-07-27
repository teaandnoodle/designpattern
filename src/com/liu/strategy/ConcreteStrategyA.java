package com.liu.strategy;

public class ConcreteStrategyA implements Strategy{

	@Override
	public void algorithmInterface(int a, int b) {
		System.out.println(String.format("Using ConcreteStrategyA:(a+b=%d)", (a + b)));
	}

}
