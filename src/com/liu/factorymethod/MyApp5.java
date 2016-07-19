package com.liu.factorymethod;

public class MyApp5 {
	public static Document createDefaultDocument() {
		return new DefaultDocument();
	}
	public static Document createMyDocument() {
		return new MyDocument();
	}
	public static Document createYourDocument() {
		return new YourDocument();
	}
}
