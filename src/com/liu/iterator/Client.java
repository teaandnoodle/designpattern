package com.liu.iterator;

import org.junit.Test;

public class Client {
	@Test
	public void test(){
		Aggregate<String> list = new ConcreteAggregate<>(5);
		
		list.setValue(0, "a");
		list.setValue(1, "b");
		list.setValue(3, "c");
		list.setValue(4, "d");
		
		Iterator<String> itr = list.createIterator();
		while(!itr.isDone()){
			System.out.print(itr.currentItem()+", ");
			itr.next();
		}
		System.out.println();
		System.out.println(list);
	}
}
