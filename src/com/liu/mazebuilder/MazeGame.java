package com.liu.mazebuilder;

import com.liu.maze.Maze;

public class MazeGame {
	public Maze createMaze(MazeBuilder builder){
		builder.buildMaze();
		
		builder.buildRoom(1);
		builder.buildRoom(2);
		builder.buildDoor(1, 2);
		
		return builder.getMaze();
	}
	public Maze MazecreateComplexMaze(MazeBuilder builder){
		builder.buildRoom(1);
		//...
		builder.buildRoom(1001);
		
		return builder.getMaze();
	}
}
