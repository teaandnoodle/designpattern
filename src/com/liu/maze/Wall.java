package com.liu.maze;

public class Wall extends MapSite{
	@Override
	public void enter() {
		System.out.println("It is just a wall:" + this);
	}
}
