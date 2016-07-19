package com.liu.composite;

public interface Component {
	public String getName();
	public void setGroup(String group);
	//
	public String operation();
	public void add(Component component);
	public void remove(Component component);
	public Component getChild(String name);
}
