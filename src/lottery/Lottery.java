package lottery;

import java.util.ArrayList;
import java.util.List;

import draftPicks.Ball;
import draftPicks.Hopper;

public class Lottery {

	Hopper red = new Hopper();
	Hopper white = new Hopper();

	public List<Ball> redBallCreate() {
		List<Ball> red = new ArrayList<>();
		for (int i = 1; i <= 26; i++){
		red.add(new Ball(Integer.toString(i)));
		}
		return red;
	}
	public List<Ball> whiteBallCreate() {
			List<Ball> white = new ArrayList<>();
			for (int i = 1; i <= 69; i++){
				white.add(new Ball(Integer.toString(i)));
			}
			return white;
	}
	public void addBallToHopper() {
		red.setHopper(redBallCreate());
		white.setHopper(whiteBallCreate());
	}
	public void shuffleBalls() {
		red.shuffleBalls();
		white.shuffleBalls();
	}
	public Ball pickBall(String whiteOrRed) {
		switch(whiteOrRed) {
		case "white":
			return white.getHopper().remove(0);
		case "red":
			return red.getHopper().remove(0);
		}
		return null;
	}
}
