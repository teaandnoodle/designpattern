package com.liu.composite;

public class Leaf implements Component {
	private String name = null;
	private String group = null;

	public Leaf(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setGroup(String group) {
		this.group = group;
	}
	public String toString() {
		return group + "-" + name;
	}
	//
	@Override
	public String operation() {
		return toString();
	}

	@Override
	public void add(Component component) {
		// do nothing
	}

	@Override
	public void remove(Component component) {
		// do nothing
	}

	@Override
	public Component getChild(String name) {
		// do nothing
		return null;
	}

}
