package com.liu.maze;

public class Door extends MapSite{
	private Room _room1;
	private Room _room2;
	@SuppressWarnings("unused")
	private boolean _isOpen;
	
	public Door(Room room1, Room room2){
		_room1 = room1;
		_room2 = room2;
		_isOpen = false;
	}
	//find the side' room
	public Room ohterSideFrom(Room room){
		if(room == _room1){
			return _room2;
		} else if(room == _room2){
			return _room1;
		}
		return null;
	}
	
	@Override
	public void enter() {
		_isOpen = true;
		System.out.println("steped through "+ this);
	}
}
