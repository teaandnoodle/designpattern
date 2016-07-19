package com.liu.proxy;

public class RealSubject implements Subject {
	@Override
	public void request() {
		System.out.println("Real load the image.");
	}
}
