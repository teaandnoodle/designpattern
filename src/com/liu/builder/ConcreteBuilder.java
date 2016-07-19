package com.liu.builder;

public class ConcreteBuilder implements Builder{

	private Product product;
	
	public ConcreteBuilder() {
		product = new ConcreteProduct();
	}
	
	@Override
	public void buildPart() {
		product.giveName("new name");
	}
	
	public Product getResult(){
		return product;
	}

}
