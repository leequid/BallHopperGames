package bingo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class bingoBoard {
	private String[][] board = new String[5][5];

	public void randomizedBoard() {
		List<String> B = new ArrayList<>();
		List<String> I = new ArrayList<>();
		List<String> N = new ArrayList<>();
		List<String> G = new ArrayList<>();
		List<String> O = new ArrayList<>();

		for (int i = 1; i <= 15; i++) {
			if (i >= 1 && i < 10) {
				B.add("B" + Integer.toString(i) + "   ");
			} else {
				B.add("B" + Integer.toString(i) + "  ");
			}
		}
		for (int i = 16; i <= 30; i++) {
			I.add("I" + Integer.toString(i) + "  ");
		}
		for (int i = 31; i <= 45; i++) {
			N.add("N" + Integer.toString(i) + "  ");
		}
		for (int i = 46; i <= 60; i++) {
			G.add("G" + Integer.toString(i) + "  ");
		}
		for (int i = 61; i <= 75; i++) {
			O.add("O" + Integer.toString(i) + "  ");
		}

		Collections.shuffle(B);
		Collections.shuffle(I);
		Collections.shuffle(N);
		Collections.shuffle(G);
		Collections.shuffle(O);

		for (int i = 0; i < 5; i++) {
			board[i][0] = B.get(i);
		}
		for (int i = 0; i < 5; i++) {
			board[i][1] = I.get(i);
		}
		for (int i = 0; i < 5; i++) {
			board[i][2] = N.get(i);
		}
		for (int i = 0; i < 5; i++) {
			board[i][3] = G.get(i);
		}
		for (int i = 0; i < 5; i++) {
			board[i][4] = O.get(i);
		}

		board[2][2] = "FREE ";

	}

	@Override
	public String toString() {
		String boardPrint = "";

		for (int j = 0; j < 5; j++) {

			for (int i = 0; i < 5; i++) {
				boardPrint += board[j][i];
			}
			boardPrint += "\n";
		}
		return boardPrint;
	}

	public String[][] getBoard() {
		return board;
	}

	public void setBoard(String[][] board) {
		this.board = board;
	}

	public bingoBoard(String[][] board) {
		this.board = board;
	}

	public bingoBoard() {
		// TODO Auto-generated constructor stub
	}

}
