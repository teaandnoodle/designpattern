package com.liu.interpreter;

public class Not extends NotExp implements NonTerminalExpression {

	private NotExp exp = null;

	public Not(NotExp exp) {
		this.exp = exp;
	}

	@Override
	public boolean evaluate(Context context) {
		return !exp.evaluate(context);
	}
}
