package com.Game;

public class GameFunc {
	static char[][] board;
	
	GameFunc()
	{
		board=new char[3][3];
		initilize();
	}
	void initilize() 
	{
		for(int i=0;i<board.length;i++)
		{
			for(int j=0;j<board[i].length;j++)
			{
				board[i][j]=' ';
			}
		}
	}
	void DisplayBoard() 
	{
		System.out.println("-------------");
		for(int i=0;i<board.length;i++)
		{
			System.out.print("| ");
			for(int j=0;j<board[i].length;j++)
			{
				System.out.print(board[i][j]+" | ");
			}
			System.out.println();
			System.out.println("-------------");
			
		}
	}
	static void mark(int row ,int col ,char mark)
	{
		if(row <=2 && col<=2)
		{
			board[row][col]=mark;
		}
		else
		{
			System.out.println("Enter Correct Position.");
		}
		
	}
	boolean WinCheckOfCol()
	{
		for(int j=0;j<=2;j++) 
		{
		
				if(board[0][j]!=' ' && board[0][j]==board[1][j] && board[1][j]==board[2][j])
				{
					return true;
				}
			
			
		}
		return false;
		
	}
	boolean WinCheckOfRow()
	{
		for(int i=0;i<=2;i++) 
		{
			if(board[i][0]!=' ')
			{
				if(board[i][0]==board[i][1] && board[i][1]==board[i][2])
				{
					return true;
				}
			}
			
		}
		return false;
		
	}

	boolean WinCheckOfDiog() {

		if (board[0][0] != ' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2]
				|| board[0][2] != ' ' && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
			return true;

		}

		return false;

	}
	boolean checkDraw() {
		for(int i=0;i<=2;i++) {
			for(int j=0;j<=2;j++) {
				if(board[i][j]==' ') {
					return false;
				}
			}
		}
		return true;
	}
	
}


