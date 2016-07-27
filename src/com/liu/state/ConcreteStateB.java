package com.liu.state;

public class ConcreteStateB extends State{

	private static State s = null;
	@Override
	public void handle(Context context) {
		System.out.println("Handle the state(ConcreteStateB)!");
		changeState(context, instance());
	}

	public static State instance(){
		if (s == null) {
			s = new ConcreteStateB();
		}
		return s;
	}

}
