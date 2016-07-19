package com.liu.abstractfactory;

public class LinuxWindow  implements Window{
	@Override
	public void show() {
		System.out.println("Show Linux's window!");
	}
}
