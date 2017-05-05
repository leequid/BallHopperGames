package bingo;

import java.util.ArrayList;
import java.util.List;

import draftPicks.Ball;

public class bingoPlayer {
	List<bingoBoard> boards = new ArrayList<>();

	public void buyBoard() {
		bingoBoard oneBoard = new bingoBoard();
		oneBoard.randomizedBoard();
		boards.add(oneBoard);
	}

	public void ballMatchBoard(Ball pickedBall) {
		char pickedBallLetter = pickedBall.getTeamName().charAt(0);
		for (bingoBoard bingoBoard : boards) {
			if (pickedBallLetter == 'B') {
				for (int i = 0; i < 5; i++) {
					if (pickedBall.getTeamName().equals(bingoBoard.getBoard()[i][0])) {
						bingoBoard.getBoard()[i][0] = "  X  ";
					}
				}
			} else if (pickedBallLetter == 'I') {
				for (int i = 0; i < 5; i++) {
					if (pickedBall.getTeamName().equals(bingoBoard.getBoard()[i][1])) {
						bingoBoard.getBoard()[i][1] = "  X  ";
					}
				}
			} else if (pickedBallLetter == 'N') {
				for (int i = 0; i < 5; i++) {
					if (pickedBall.getTeamName().equals(bingoBoard.getBoard()[i][2])) {
						bingoBoard.getBoard()[i][2] = "  X  ";
					}
				}
			} else if (pickedBallLetter == 'G') {
				for (int i = 0; i < 5; i++) {
					if (pickedBall.getTeamName().equals(bingoBoard.getBoard()[i][3])) {
						bingoBoard.getBoard()[i][3] = "  X  ";
					}
				}
			} else if (pickedBallLetter == 'O') {
				for (int i = 0; i < 5; i++) {
					if (pickedBall.getTeamName().equals(bingoBoard.getBoard()[i][4])) {
						bingoBoard.getBoard()[i][4] = "  X  ";
					}
				}
			}

		}
	}

	public boolean winCondition() {
		int horizontalCounter = 0;
		int verticalCounter = 0;
		int diagcounter1 = 0;
		int diagcounter2 = 0;
		for (bingoBoard bingoBoard : boards) {
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					if (bingoBoard.getBoard()[i][j].equals("  X  ") || bingoBoard.getBoard()[i][j].equals("FREE ")) {
						horizontalCounter++;
					}
					if (bingoBoard.getBoard()[j][i].equals("  X  ") || bingoBoard.getBoard()[j][i].equals("FREE ")) {
						verticalCounter++;
					}
					if (i == j && bingoBoard.getBoard()[j][i].equals("  X  ")) {
						diagcounter1++;
					}
					if ((i + j) == 4 && bingoBoard.getBoard()[i][j].equals("  X  ")) {

						diagcounter2++;
					}

				}
				if (horizontalCounter == 5 || verticalCounter == 5) {

					return true;
				} else {
					horizontalCounter = 0;
					verticalCounter = 0;
				}

			}
			if (diagcounter1 == 4 || diagcounter2 == 4) {
				return true;
			} else {
				diagcounter1 = 0;
				diagcounter2 = 0;
			}

		}

		return false;
	}
}
