package com.liu.adapter;

public class Adapter implements Target {
	private Adaptee adaptee = null;

	public Adapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}

	@Override
	public void request() {
		adaptee.specificRequest();
	}

}
