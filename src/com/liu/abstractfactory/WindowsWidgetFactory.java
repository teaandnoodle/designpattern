package com.liu.abstractfactory;

public class WindowsWidgetFactory implements WidgetFactory{
	@Override
	public Window createWindow() {
		return new WindowsWindow();
	}
}
