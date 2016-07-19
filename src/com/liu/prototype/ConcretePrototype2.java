package com.liu.prototype;

public class ConcretePrototype2 implements Prototype {

	private String name = null;
	public ConcretePrototype2(String name) {
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
		return new ConcretePrototype2(name);// shallow copy
	}

}
