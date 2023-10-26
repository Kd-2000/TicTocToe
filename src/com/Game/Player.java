package com.Game;



public abstract class Player {
	String name;
	char mark;
	abstract void move();
	boolean isValidMove(int row, int col) {
		if(row>=0 && row<=2 || col>=0 && col<=2) 
		{
			if(GameFunc.board[row][col]==' ') {
				return true;
			}
		}
		
		return false;
	}
}
