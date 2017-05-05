package draftPicks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hopper {
	private List<Ball> hopper = new ArrayList<>(1000);

	public Hopper() {

	}

	public void addBall(Ball b) {
		hopper.add(b);
	}

	public void shuffleBalls() {
		Collections.shuffle(hopper);

	}

	public List<Ball> getHopper() {
		return hopper;
	}

	public void setHopper(List<Ball> hopper) {
		this.hopper = hopper;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Hopper [hopper=");
		builder.append(hopper);
		builder.append("]");
		return builder.toString();
	}
}
