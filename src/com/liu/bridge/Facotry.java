package com.liu.bridge;

public class Facotry {
	public static Implementor getInstance() {
		if ("ImpA".equals(System.getProperty("facotry"))) {
			return new ConcreteImplementorA();
		} else {
			return new ConcreteImplementorB();
		}
	}
}
