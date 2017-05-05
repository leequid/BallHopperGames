package draftPicks;

import java.util.ArrayList;
import java.util.List;

public class NBA {
	Hopper draft2016 = new Hopper();

	public List<Ball> ballCreate() {
		List<Ball> listBall = new ArrayList<>();

		listBall.add(new Ball("Philadelphia 76ers"));
		listBall.add(new Ball("LA Lakers"));
		listBall.add(new Ball("Brooklyn Nets"));
		listBall.add(new Ball("Pheonix Suns"));
		listBall.add(new Ball("Minnesota Timberwolves"));
		listBall.add(new Ball("New Orleans Pelicans"));
		listBall.add(new Ball("New York Knicks"));
		listBall.add(new Ball("Sacramento Knights"));
		listBall.add(new Ball("Denver Nuggets"));
		listBall.add(new Ball("Milwaukee Bucks"));
		listBall.add(new Ball("Orlando Magic"));
		listBall.add(new Ball("Utah Jazz"));
		listBall.add(new Ball("Washington Wizards"));
		listBall.add(new Ball("Chicago Bulls"));

		return listBall;
	}

	public void addBallToHopper() {
		for (int i = 0; i < 250; i++) {
			draft2016.addBall(ballCreate().get(0));
		}
		for (int i = 0; i < 199; i++) {
			draft2016.addBall(ballCreate().get(1));
		}
		for (int i = 0; i < 156; i++) {
			draft2016.addBall(ballCreate().get(2));
		}
		for (int i = 0; i < 119; i++) {
			draft2016.addBall(ballCreate().get(3));
		}
		for (int i = 0; i < 88; i++) {
			draft2016.addBall(ballCreate().get(4));
		}
		for (int i = 0; i < 63; i++) {
			draft2016.addBall(ballCreate().get(5));
		}
		for (int i = 0; i < 43; i++) {
			draft2016.addBall(ballCreate().get(6));
		}
		for (int i = 0; i < 19; i++) {
			draft2016.addBall(ballCreate().get(7));
		}
		for (int i = 0; i < 19; i++) {
			draft2016.addBall(ballCreate().get(8));
		}
		for (int i = 0; i < 18; i++) {
			draft2016.addBall(ballCreate().get(9));
		}
		for (int i = 0; i < 8; i++) {
			draft2016.addBall(ballCreate().get(10));
		}
		for (int i = 0; i < 7; i++) {
			draft2016.addBall(ballCreate().get(11));
		}
		for (int i = 0; i < 6; i++) {
			draft2016.addBall(ballCreate().get(12));
		}
		for (int i = 0; i < 5; i++) {
			draft2016.addBall(ballCreate().get(13));
		}

	}

	public String drawABall() {
		
		return draft2016.getHopper().get(0).getTeamName();
	}

	public Hopper getDraft2016() {
		return draft2016;
	}

	public void setDraft2016(Hopper draft2016) {
		this.draft2016 = draft2016;
	}
}