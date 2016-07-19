package com.liu.factorymethod;

public class MyApp2  extends Application2{
	@Override
	public Document createDocument(String docName) {
		if("mydoc".equals(docName)){
			return new MyDocument();
		} else if("yourdoc".equals(docName)){
			return new YourDocument();
		}
		return new DefaultDocument();
	}
}
