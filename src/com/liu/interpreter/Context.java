package com.liu.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * NotExp = VariableExp | Not |'('NotExp')'
 * Not = 'not' NotExp
 * VariableExp = 'A' | 'B' | 'C' | 'D' |..
 * */
public class Context {

	private Map<String, Boolean> store = new HashMap<>();

	public boolean lookUp(String name) {
		return store.get(name);
	}

	public void assign(VariableExp var, boolean val) {
		store.put(var.getName(), val);
	}
}
