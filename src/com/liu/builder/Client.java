package com.liu.builder;

import org.junit.Test;

public class Client {
	@Test
	public void testBuilder(){
		Director director = new Director();
		//这里可以使用不同的builder
		Product product = director.Construct(new ConcreteBuilder());
		System.out.println(product.toString());
	}
}
