package com.liu.bridge;

public class RefinedAbstraction extends Abstraction{
	@Override
	public void operation() {
		getImplementition().operationImp();
	}
}
