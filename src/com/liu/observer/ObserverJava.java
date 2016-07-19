package com.liu.observer;

import java.util.Observable;

public class ObserverJava implements java.util.Observer{
	
	@Override
	public void update(Observable o, Object arg) {
		SubjectJava suject = (SubjectJava) o;
		System.out.println(suject.getState());
	}
}
