package com.liu.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * reference:
 * <a href='http://www.cnblogs.com/itTeacher/archive/2012/12/02/2797857.html'>
 * Java设计模式四: 原型模式(Prototype Pattern)</a>
 */
public class SerializablePrototype implements Serializable {
	private static final long serialVersionUID = 4653567423161077789L;
	private SerializableName name = null;

	public SerializablePrototype(SerializableName name) {
		this.setName(name);
	}

	public SerializableName getName() {
		return name;
	}

	public void setName(SerializableName name) {
		this.name = name;
	}

	// deep copy
	public Object deepClone() {
		try {
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			ObjectOutputStream objOut = new ObjectOutputStream(out);
			objOut.writeObject(this);

			ByteArrayInputStream in = new ByteArrayInputStream(out.toByteArray());
			ObjectInputStream objIn = new ObjectInputStream(in);
			return objIn.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static class SerializableName implements Serializable {

		private static final long serialVersionUID = 2407657721744992188L;
		private String name;

		public SerializableName(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String toString() {
			return name;
		}
	}
}
