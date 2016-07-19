package com.liu.mazebuilder;

import com.liu.maze.Direction;
import com.liu.maze.Door;
import com.liu.maze.Maze;
import com.liu.maze.Room;
import com.liu.maze.Wall;

public class StandarMazeBuilder implements MazeBuilder{
	private Maze _currentMaze;
	
	public StandarMazeBuilder() {
		_currentMaze = null;
	}
	private Direction commonWall(Room room1, Room room2){
		if(room1.getSide(Direction.EAST) == room2){
			return Direction.EAST;
		} else if(room1.getSide(Direction.WEST) == room2){
			return Direction.WEST;
		} else if(room1.getSide(Direction.SOUTH) == room2){
			return Direction.SOUTH;
		} else if(room1.getSide(Direction.NORTH) == room2){
			return Direction.NORTH;
		} 
		return null;
	}
	@Override
	public void buildMaze() {
		_currentMaze = new Maze();		
	}

	@Override
	public void buildRoom(int n) {
		if(_currentMaze.roomNo(n) == null){
			Room room = new Room(n);
			_currentMaze.addRoom(new Room(n));
			
			room.setSide(Direction.NORTH, new Wall());
			room.setSide(Direction.SOUTH, new Wall());
			room.setSide(Direction.EAST, new Wall());
			room.setSide(Direction.WEST, new Wall());
		}
	}

	@Override
	public void buildDoor(int roomFrom, int roomTo) {
		Room r1 = _currentMaze.roomNo(roomFrom);
		Room r2 = _currentMaze.roomNo(roomTo);
		
		Door d = new Door(r1, r2);
		r1.setSide(commonWall(r1, r2), d);
		r2.setSide(commonWall(r2, r1), d);
	}

	@Override
	public Maze getMaze() {
		return _currentMaze;
	}

}
