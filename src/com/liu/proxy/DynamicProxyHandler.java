package com.liu.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

class DynamicProxyHandler implements InvocationHandler {
	private Object proxied;

	public DynamicProxyHandler(Object proxied) {
		this.proxied = proxied;
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println(proxy.getClass());
		System.out.println("Do some extra job1!");
		Object obj = method.invoke(proxied, args);
		System.out.println("Do some extra job2!");
		return obj;
	}
}