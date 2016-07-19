package com.liu.factorymethod;

public class MyApp4 {
	public Document createDefaultDocument() {
		return new DefaultDocument();
	}
	public Document createMyDocument() {
		return new MyDocument();
	}
	public Document createYourDocument() {
		return new YourDocument();
	}
}
