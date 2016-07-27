package com.liu.state;

public class ConcreteStateA extends State {
	private static State s = null;

	@Override
	public void handle(Context context) {
		System.out.println("Handle the state(ConcreteStateA)!");
		changeState(context, instance());
	}

	public static State instance() {
		if (s == null) {
			s = new ConcreteStateA();
		}
		return s;
	}

}
