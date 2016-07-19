package com.liu.prototype;

import org.junit.Test;

import static org.junit.Assert.*;

public class CloneableClient {

	@Test
	public void shallowcopy() {
		Address addr = new Address("Wuhan");
		CloneablePrototype1 p1 = new CloneablePrototype1("abc", addr);
		CloneablePrototype1 q1 = (CloneablePrototype1) p1.clone();
		assertTrue(p1.getAddr() == q1.getAddr());//shallow copy
		assertTrue(p1.getName() == q1.getName());
		
		CloneablePrototype2 p2 = new CloneablePrototype2("bcd", addr);
		CloneablePrototype2 q2 = (CloneablePrototype2) p2.clone();
		assertFalse(p2.getAddr() == q2.getAddr());//deep copy
		assertFalse(p2.getName() == q2.getName());
	}
}
