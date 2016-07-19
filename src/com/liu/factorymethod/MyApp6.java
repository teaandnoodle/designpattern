package com.liu.factorymethod;

public class MyApp6 {
	public static Object createDefaultDocument(String className) {
		try {
			Class<?> claz = Class.forName(className);
			return claz.newInstance();
		} catch (Exception e) {
			return null;
		}
	}
}
