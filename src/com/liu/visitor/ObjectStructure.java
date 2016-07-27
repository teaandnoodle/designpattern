package com.liu.visitor;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure implements Element {
	private List<Element> children = null;

	public ObjectStructure() {
		children = new ArrayList<>();
	}

	public void addElement(Element e) {
		children.add(e);
	}

	public void removeElement(Element e) {
		children.remove(e);
	}

	public void removeElement(int index) {
		children.remove(index);
	}

	@Override
	public void accept(Visitor visitor) {
		for (Element elem : children) {
			elem.accept(visitor);
		}
		visitor.VisitObjectStructure(this);
	}
}
