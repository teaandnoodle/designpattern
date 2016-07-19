package com.liu.factorymethod;

public class MyApp1 extends Application{

	@Override
	public Document createDocument() {//create products
		return new DefaultDocument();
	}

}
