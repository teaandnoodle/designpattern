package com.liu.memento;

import org.junit.Test;

public class Cleint {
	@Test
	public void test() {
		Originator org = new Originator();
		Caretaker care = new Caretaker();
		//修改原发器状态
		org.changeState("StateA");
		//负责人存储当前状态
		care.setMemento(org.createMemento());
		//修改原发器状态
		org.changeState("StateB");
		//使用负责人存储的状态恢复原发器状态
		org.setMemento(care.getMemento());
		//获取当前的状态
		System.out.println(org.createMemento().getState());
	}
}
