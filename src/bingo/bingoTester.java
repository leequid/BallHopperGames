package bingo;

import java.util.Scanner;
import draftPicks.Ball;

public class bingoTester {

	public static void main(String[] args) {
		run();
	}

	public static void run() {
		Scanner kb = new Scanner(System.in);
		bingo caller = new bingo();
		caller.addBallHopper();
		bingoPlayer Eric = new bingoPlayer();
		System.out.println("How many boards do you want to buy? :");
		int number = kb.nextInt();
		for (int i = 0; i < number; i++) {
			Eric.buyBoard();
		}
		for (int i = 0; Eric.boards.size() > i; i++) {
			System.out.println(Eric.boards.get(i));
			System.out.println();
		}
		kb.nextLine();

		while (!Eric.winCondition()) {
			caller.shuffleBall();
			Ball pickedBall = caller.darwBall();
			System.out.println("The ball is: " + pickedBall.getTeamName());
			Eric.ballMatchBoard(pickedBall);
			for (int i = 0; Eric.boards.size() > i; i++) {
				System.out.println(Eric.boards.get(i));
				System.out.println();
			}
			kb.nextLine();

		}
		kb.close();
		System.out.println("I won!!");
	}

}
