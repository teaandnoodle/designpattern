package com.liu.proxy;

public class StaticClient {

	public void staticProxyTest() {
		// use real object
		RealSubject real = new RealSubject();
		doSomeJob(real);
		// use proxy
		Subject proxy = new StaticProxy(new RealSubject());
		doSomeJob(proxy);
	}

	// test method
	public void doSomeJob(Subject subject) {
		subject.request();
	}
}