package com.liu.maze;

import java.util.HashMap;
import java.util.Map;

public class Room extends MapSite{
	private int _roomNumber = 0;
	private Map<Direction,MapSite> _sides = new HashMap<>();
	
	public Room(int roomNo){
		this._roomNumber = roomNo;
	}
	//just to get the room NO
	public int getRoomNo(){
		return _roomNumber;
	}
	
	//
	public MapSite getSide(Direction dir){
		return _sides.get(dir);
	}
	
	public void setSide(Direction dir, MapSite site){
		_sides.put(dir, site);
	}
	
	@Override
	public void enter() {
		System.out.println("steped in " + this);
	}
}
