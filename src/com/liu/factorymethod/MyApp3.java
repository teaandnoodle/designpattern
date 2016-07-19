package com.liu.factorymethod;

public class MyApp3 {
	public Document createDocument(String docName) {
		if("mydoc".equals(docName)){
			return new MyDocument();
		} else if("yourdoc".equals(docName)){
			return new YourDocument();
		}
		return new DefaultDocument();
	}
}
