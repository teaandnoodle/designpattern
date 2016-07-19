package com.liu.proxy;

public class StaticProxy implements Subject {

	private Subject realSubject = null;

	public StaticProxy(Subject realSubject) {
		this.realSubject = realSubject;
	}

	@Override
	public void request() {
		if (realSubject != null) {
			System.out.println("Do some extra job1!");
			realSubject.request();
			System.out.println("Do some extra job2!");
		} else {
			throw new RuntimeException("Proxy haven't initialed!");
		}
	}
}
