package lottery;

public class LotteryDriver {

	public static void main(String[] args) {
		Lottery play = new Lottery();
		play.addBallToHopper();
		play.shuffleBalls();
		System.out.print("\t");
		for (int i = 0; i < 5; i++) {
			System.out.print(play.pickBall("white").getTeamName() + " | ");
			if (i == 4) {
				System.err.print(play.pickBall("red").getTeamName() + " ");
				
			}
		}
//		System.out.println(play.pickBall("red").getTeamName());
	}

}
