package com.liu.templatemethod;

import org.junit.Test;

public class Client {
	@Test
	public void test(){
		AbstractClass method = new ConcreteClass();
		method.templateMethod();
	}
}
