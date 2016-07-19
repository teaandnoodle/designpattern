package com.liu.abstractfactory;

public class LinuxWidgetFactory  implements WidgetFactory{

	@Override
	public Window createWindow() {
		return new LinuxWindow();
	}
}
