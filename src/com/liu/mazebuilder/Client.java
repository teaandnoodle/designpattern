package com.liu.mazebuilder;

import org.junit.Test;

import com.liu.maze.Maze;

public class Client {

	@Test
	public void test1(){
		MazeGame game = new MazeGame();
		MazeBuilder builder = new StandarMazeBuilder();
		game.createMaze(builder);
		
		@SuppressWarnings("unused")
		Maze maze = builder.getMaze();
	}
}
