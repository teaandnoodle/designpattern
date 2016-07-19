package com.liu.iterator;

public interface Aggregate<E> {
	public void setValue(int index, E value);
	public Iterator<E> createIterator();
}
