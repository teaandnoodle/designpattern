package com.liu.interpreter;

public class VariableExp extends NotExp implements TerminalExpression {
	private String name = null;

	public VariableExp(String name) {
		this.name = name.toUpperCase();
	}

	public String getName() {
		return name;
	}

	@Override
	public boolean evaluate(Context context) {
		return context.lookUp(name);
	}

}
