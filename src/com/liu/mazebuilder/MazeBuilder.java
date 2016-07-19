package com.liu.mazebuilder;

import com.liu.maze.Maze;

public interface MazeBuilder {//base Builder class

	public void buildMaze();
	public void buildRoom(int room);
	public void buildDoor(int roomFrom, int roomTo);
	
	public Maze getMaze();
}
