package com.liu.factorymethod;

public abstract class Application {
	
	private Document doc;
	
	public abstract Document createDocument();//Factory Method
	
	public void openDocument(){
		doc = createDocument();
		doc.open();
	}
}
