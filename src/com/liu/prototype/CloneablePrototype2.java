package com.liu.prototype;

public class CloneablePrototype2 implements Cloneable {

	private String name = null;
	private Address addr = null;

	public CloneablePrototype2(String name, Address addr) {
		this.name = name;
		this.addr = addr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	// deep copy
	public Object clone() {
		try {
			CloneablePrototype2 pro = (CloneablePrototype2) super.clone();
			pro.setName(new String(name));
			pro.setAddr((Address) addr.clone());
			return pro;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
}
