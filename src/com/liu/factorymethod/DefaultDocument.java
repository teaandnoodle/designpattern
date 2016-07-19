package com.liu.factorymethod;

public class DefaultDocument implements Document{
	
	@Override
	public void open() {
		System.out.println("Open " + getClass().getSimpleName() + "!");
	}

	@Override
	public void close() {
		System.out.println("Close " + getClass().getSimpleName() + "!");		
	}

	@Override
	public void save() {
		System.out.println("Save " + getClass().getSimpleName() + "!");
	}

}
