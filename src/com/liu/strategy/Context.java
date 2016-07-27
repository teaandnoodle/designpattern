package com.liu.strategy;

public class Context {
	private Strategy strategy = null;

	public Context(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public void changeStrategy(Strategy strategy){
		this.strategy = strategy;
	}
	public void contextInterface(int a, int b){
		strategy.algorithmInterface(a, b);
	}
}
