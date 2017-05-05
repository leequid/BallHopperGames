package bingo;

import draftPicks.Ball;
import draftPicks.Hopper;

public class bingo {
	private Hopper bingoHopper = new Hopper();

	public void addBallHopper() {
		for (int i = 1; i <= 15; i++) {
			if (i >= 1 && i < 10) {
				bingoHopper.addBall(new Ball("B" + i + "   "));
			} else {
				bingoHopper.addBall(new Ball("B" + i + "  "));
			}
		}
		for (int i = 16; i <= 30; i++) {
			bingoHopper.addBall(new Ball("I" + i + "  "));
		}
		for (int i = 31; i <= 45; i++) {
			bingoHopper.addBall(new Ball("N" + i + "  "));
		}
		for (int i = 46; i <= 60; i++) {
			bingoHopper.addBall(new Ball("G" + i + "  "));
		}
		for (int i = 61; i <= 75; i++) {
			bingoHopper.addBall(new Ball("O" + i + "  "));
		}
	}

	public void shuffleBall() {
		bingoHopper.shuffleBalls();
	}

	public Ball darwBall() {
		return bingoHopper.getHopper().remove(0);
	}

}
