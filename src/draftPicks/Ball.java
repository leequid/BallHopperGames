package draftPicks;

public class Ball {
	private String teamName;
	

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public Ball(String teamName) {
		super();
		this.teamName = teamName;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ball [teamName=");
		builder.append(teamName);
		builder.append("]");
		return builder.toString();
	}
	
}
