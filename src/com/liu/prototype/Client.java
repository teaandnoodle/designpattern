package com.liu.prototype;

import static org.junit.Assert.*;
import org.junit.Test;

public class Client {
	@Test
	public void operation() {
		// deep copy
		Prototype p1 = new ConcretePrototype1("abc");
		Prototype q1 = p1.myclone();
		assertFalse(p1.getName() == q1.getName());
		
		// shallow copy
		Prototype p2 = new ConcretePrototype2("bcd");
		Prototype q2 = p2.myclone();
		assertTrue(p2.getName() == q2.getName());
	}
}
