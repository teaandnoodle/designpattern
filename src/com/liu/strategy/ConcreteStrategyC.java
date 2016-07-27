package com.liu.strategy;

public class ConcreteStrategyC implements Strategy{

	@Override
	public void algorithmInterface(int a, int b) {
		System.out.println(String.format("Using ConcreteStrategyC:(a*b=%d)", (a * b)));
	}

}
