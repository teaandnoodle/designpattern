package com.liu.prototype;

public class ConcretePrototype1 implements Prototype {

	private String name = null;

	public ConcretePrototype1(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public Prototype myclone() {
		return new ConcretePrototype1(new String(name));// deep copy
	}
}
