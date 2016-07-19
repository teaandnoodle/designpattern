package com.liu.singleton;

public class Singleton5 {
	private Singleton5(){}
	
	private static class Holder{
		public static final Singleton5 instance = new Singleton5();
	}
	
	public static Singleton5 getInstance(){
		return Holder.instance;
	}
}