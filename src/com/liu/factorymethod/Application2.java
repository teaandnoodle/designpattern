package com.liu.factorymethod;

public abstract class Application2 {
	private Document doc;
	
	public abstract Document createDocument(String docName);//Factory Method
	
	public void openDocument(String docName){
		doc = createDocument(docName);
		doc.open();
	}
}
