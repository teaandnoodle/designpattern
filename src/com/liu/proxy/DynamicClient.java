package com.liu.proxy;

import java.lang.reflect.Proxy;

import org.junit.Test;

public class DynamicClient {
	@Test
	public void dynamicProxyTest() {
		RealSubject real = new RealSubject();
		Subject proxy = (Subject) proxy(real, Subject.class);
		proxy.request();
	}
	
	public <T> Object proxy(Object real, Class<T> clazz){
		return Proxy.newProxyInstance(clazz.getClassLoader(), 
				new Class[] { clazz },
				new DynamicProxyHandler(real));
	}
}
