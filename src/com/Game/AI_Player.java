package com.Game;

import java.util.Random;
import java.util.Scanner;

public class AI_Player extends Player {
	AI_Player(String name, char mark) {
		this.name = name;
		this.mark = mark;
	}
	Scanner s = new Scanner(System.in);
	void move() {
		
		int row = 0;
		int col = 0;
		do {
			Random r=new Random();
			row=r.nextInt(3);
			col=r.nextInt(3);
		} while (!isValidMove(row, col));

		GameFunc.mark(row, col, mark);
	}
}
