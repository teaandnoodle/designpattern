package com.liu.iterator;

import java.util.Arrays;

/**
 * 模拟一个List
 * */
public class ConcreteAggregate<E> implements Aggregate<E> {

	private E list[] = null;
	private int size = 0;

	@SuppressWarnings("unchecked")
	public ConcreteAggregate(int size) {
		list = (E[]) new Object[size];
		this.size = size;
	}

	public void setValue(int index, E value){
		if(index < size){
			list[index] = value;
		}
	}
	
	public String toString(){
		return Arrays.toString(list);
	}
	@Override
	public Iterator<E> createIterator() {
		return new Itr();
	}

	private class Itr implements Iterator<E> {

		int now = 0;

		@Override
		public void first() {
			now = 0;
		}

		@Override
		public void next() {
			now++;
		}

		@Override
		public boolean isDone() {
			return now >= size;
		}

		@Override
		public E currentItem() {
			return list[now];
		}

	}
}
