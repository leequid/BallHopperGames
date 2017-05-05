package draftPicks;

public class teamStats implements Comparable<teamStats> {

	private String name;
	private int picked;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPicked() {
		return picked;
	}

	public void setPicked(int picked) {
		this.picked = picked;
	}

	public teamStats(String name, int picked) {
		super();
		this.name = name;
		this.picked = picked;
	}

	@Override
	public int compareTo(teamStats other) {
		if (this.picked < other.picked) {
			return -1;
		} else if (this.picked > other.picked) {
			return 1;
		} else
			return 0;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("teamStats name=");
		builder.append(name);
		builder.append(", picked=");
		builder.append(picked);
		builder.append("]");
		return builder.toString();
	}

}
