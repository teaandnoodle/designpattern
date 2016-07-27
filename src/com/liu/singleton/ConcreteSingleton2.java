package com.liu.singleton;

import org.junit.Test;

public class ConcreteSingleton2 extends Singleton2{
	public ConcreteSingleton2(){
		register("ConcreteSingleton2", this);
	}
	
	@Test
	public void test(){
		//初始化时必须这么做
		new ConcreteSingleton2();
		System.setProperty("SINGLETON", "ConcreteSingleton2");
		//实际使用时
		Singleton2 s = Singleton2.getInstance();
		System.out.println(s);;
	}
}
