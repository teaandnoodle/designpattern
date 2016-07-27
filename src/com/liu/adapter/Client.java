package com.liu.adapter;

import org.junit.Test;

public class Client {
	@Test
	public void test(){
		Adaptee adaptee = new ConcreteAdaptee();
		//使用adaptee创建adapter类型变量
		INeedAAdapter(new Adapter(adaptee));
		
	}
	//测试方法
	public void INeedAAdapter(Target target){
		target.request();
	}
}
