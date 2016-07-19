package com.liu.prototype;

import static org.junit.Assert.*;

import org.junit.Test;

import com.liu.prototype.SerializablePrototype.SerializableName;

public class SerializableClient {

	@Test
	public void test() {
		SerializableName name = new SerializableName("Wuhan");
		SerializablePrototype p = new SerializablePrototype(name);
		SerializablePrototype q = (SerializablePrototype) p.deepClone();

		System.out.println(q.getName().toString());
		assertFalse(p.getName() == q.getName());
	}
}
