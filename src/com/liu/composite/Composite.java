package com.liu.composite;

import java.util.HashMap;
import java.util.Map;

public class Composite implements Component {

	private String name = null;
	private String group = null;

	public Composite(String name) {
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
	private Map<String, Component> childs = new HashMap<>();

	@Override
	public String operation() {
		StringBuilder ss = new StringBuilder();
		ss.append(toString()+":[");
		for (String name : childs.keySet()) {
			ss.append(childs.get(name).operation()+",");
		}
		ss.append("]");
		return ss.toString();
	}

	@Override
	public void add(Component component) {
		if (component != null) {
			component.setGroup(name);
			childs.put(component.getName(), component);
		}
	}

	@Override
	public void remove(Component component) {
		childs.remove(component);
	}

	@Override
	public Component getChild(String name) {
		return childs.get(name);
	}

}
