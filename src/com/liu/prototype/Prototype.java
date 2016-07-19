package com.liu.prototype;

public interface Prototype {
	public String getName();
	public void setName(String name);
	public Prototype myclone();
}
