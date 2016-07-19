package com.liu.iterator;

public interface Iterator<E> {
	public void first();

	public void next();

	public boolean isDone();

	public E currentItem();
}
