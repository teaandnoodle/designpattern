package com.liu.singleton;

//´íÎó×ö·¨
public class Singleton6 {
	private Singleton6() {}

	private static Singleton6 instance = null;

	public static Singleton6 getInstance() {
		if (instance == null) {
			synchronized (Singleton6.class) {
				if (instance == null) {
					instance = new Singleton6();
				}
			}
		}
		return instance;
	}
}