package com.Game;

import java.util.Scanner;

public class PlayGame {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		GameFunc G = new GameFunc();
		System.out.println("-----> WELCOME TO TIC-TAC-TOE GAME <-----");
		System.out.println("Choose playing option");
		System.out.println("1. With Your Friend");
		System.out.println("2. With AI");
		int option = s.nextInt();
		HumanPlayer p1 = null;
		HumanPlayer p2 = null;
		HumanPlayer p3 = null;
		AI_Player a1 = null;
		Player currentPlayer = null;

		switch (option) {
		case 1:
			System.out.println("Enter player 1st name and mark");
			String name1 = s.next();
			System.out.println("MARK : ");
			char mark1 = s.next().charAt(0);
			mark1 = Character.toUpperCase(mark1);

			System.out.println("Enter player 2nd name and mark");
			String name2 = s.next();
			System.out.println("MARK : ");
			char mark2 = s.next().charAt(0);
			mark2 = Character.toUpperCase(mark2);

			p1 = new HumanPlayer(name1, mark1);
			p2 = new HumanPlayer(name2, mark2);

			System.out.println("Match Starts");
			currentPlayer = p1;
			break;
		case 2:
			System.out.println("Enter your name and mark");
			String name = s.next();
			System.out.println("MARK : ");
			char mark = s.next().charAt(0);
			mark = Character.toUpperCase(mark);

			p3 = new HumanPlayer(name, mark);
			a1 = new AI_Player("ROBO", 'O');
			currentPlayer = p3;
			break;
		default:
			System.out.println("Enter a Correct Option");
			break;
		}

		while (true) {
			System.out.println(currentPlayer.name + " Turn ");
			currentPlayer.move();
			G.DisplayBoard(); // Assuming DisplayBoard is in GameFunc
			if (G.WinCheckOfCol() || G.WinCheckOfDiog() || G.WinCheckOfRow()) {
				System.out.println(currentPlayer.name + " Won The Match");
				break;
			}else if(G.checkDraw()) {
				System.out.println("Match Drawn");
				break;
			}
			else {
				if (currentPlayer == p1) {
					currentPlayer = p2;
				} else if (currentPlayer == p2) {
					currentPlayer = p1;
				} else if (currentPlayer == p3) {
					currentPlayer = a1;
				} else if (currentPlayer == a1) {
					currentPlayer = p3;
				}
			}
		}

		s.close();
	}
}
