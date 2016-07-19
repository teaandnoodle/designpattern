package com.liu.interpreter;

import org.junit.Test;

public class Client {
	@Test
	public void test() {
		Context context = new Context();
		
		VariableExp x = new VariableExp("x");
		VariableExp y = new VariableExp("y");
		
		context.assign(x, true);
		context.assign(y, false);
		
		NotExp exp1 = new Not(new Not(x));
		NotExp exp2 = new Not(new Not(y));
		
		System.out.println(exp1.evaluate(context));
		System.out.println(exp2.evaluate(context));
	}
}
