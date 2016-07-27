package com.liu.templatemethod;

public abstract class AbstractClass {
	public void templateMethod() {
		primitiveOperation1();
		primitiveOperation2();
	}

	protected abstract void primitiveOperation1();

	protected abstract void primitiveOperation2();
}
