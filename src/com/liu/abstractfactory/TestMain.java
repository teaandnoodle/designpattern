package com.liu.abstractfactory;

//test
public class TestMain {
	public static void Client(WidgetFactory facotry) {
		Window win = facotry.createWindow();
		win.show();
	}
	
	public static void main(String[] args) {
		String env = "windows";
		WidgetFactory facotry = null;
		
		if("windows".equals(env)){
			facotry= new WindowsWidgetFactory();
		} else {//linux
			facotry = new LinuxWidgetFactory();
		}
		Client(facotry);
	}
}
