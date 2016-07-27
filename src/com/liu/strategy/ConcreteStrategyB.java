package com.liu.strategy;

public class ConcreteStrategyB implements Strategy{

	@Override
	public void algorithmInterface(int a, int b) {
		System.out.println(String.format("Using ConcreteStrategyB:(a-b=%d)", (a - b)));
	}

}
