package com.liu.builder;

public class ConcreteProduct implements Product{
	private String name = null;
	
	public void giveName(String name){
		this.name = name;
	}
	public String toString(){
		return "ConcreteProduct: "+name;
	}
}
