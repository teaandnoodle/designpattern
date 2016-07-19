package com.liu.mediator;

public class Colleague {
	private Mediator mediator = null;

	public Colleague(Mediator mediator) {
		this.mediator = mediator;
	}

	public void changed() {
		mediator.doChange(this);
	}
}
