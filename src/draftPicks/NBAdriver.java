package draftPicks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class NBAdriver {
	private static Map<String, Integer> teamStats = new HashMap<>();

	public static void main(String[] args) {
		Set<String> key = new HashSet<>();
		List<teamStats> stats = new ArrayList<>();
		for (int i = 0; i < 1000; i++) {
			NBA n = new NBA();
			n.addBallToHopper();
			n.getDraft2016().shuffleBalls();
			// System.out.println(n.drawABall());
			if (teamStats.containsKey(n.drawABall())) {
				teamStats.put(n.drawABall(), teamStats.get(n.drawABall()) + 1);
			} else {
				teamStats.put(n.drawABall(), 1);
			}
		}
		key = teamStats.keySet();

		for (String string : key) {
			stats.add(new teamStats(string, teamStats.get(string)));
			// System.out.println(string + " | " + teamStats.get(string));
		}
		Collections.sort(stats);
		for (teamStats teamStats : stats) {
			System.out.println(teamStats);
		}
	}

}
