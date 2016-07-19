package com.liu.maze;

import java.util.HashMap;
import java.util.Map;

public class Maze {
	private Map<Integer, Room> cache= new HashMap<>();
	
	public Room roomNo(int n){
		return cache.get(n);
	}
	public void addRoom(Room room){
		cache.put(room.getRoomNo(), room);
	}
}
