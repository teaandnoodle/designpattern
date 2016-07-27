package com.liu.state;

public abstract class State {
	public abstract void handle(Context context);

	public static State instance(){
		throw new RuntimeException("Can't instance!");
	}

	public void changeState(Context context, State state) {
		context.changeState(state);
	}
}
