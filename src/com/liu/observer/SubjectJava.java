package com.liu.observer;

import java.util.Observable;

public class SubjectJava extends Observable{
	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
		setChanged();//Marks this Observable object as having been changed
		notifyObservers();//notify all Observers
	}
}
