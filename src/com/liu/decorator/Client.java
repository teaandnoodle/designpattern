package com.liu.decorator;

import org.junit.Test;

public class Client {
	@Test
	public void test(){
		Component comp1 = new ConcreteComponent();
		//A
		Component decA = new ConcreteDecoratorA(comp1);
		//B
		Component decB = new ConcreteDecoratorB(decA);
		decB.operation();
	}
}
