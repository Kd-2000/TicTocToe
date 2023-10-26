package com.Game;

import java.util.Scanner;

public class HumanPlayer extends Player {
	HumanPlayer(String name, char mark) {
		this.name = name;
		this.mark = mark;
	}
	Scanner s = new Scanner(System.in);
	void move() {
		
		int row = 0;
		int col = 0;
		do {
			System.out.println("Enter Row and Col");
			row = s.nextInt();
			col = s.nextInt();

		} while (!isValidMove(row, col));

		GameFunc.mark(row, col, mark);
	}
	

}
