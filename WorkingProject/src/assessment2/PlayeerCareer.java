package assessment2;

public class PlayeerCareer {

	private int matchesPlayed;
	private int matchesWon;
	private int currentRanking;
	private int bestRanking;
	private String preferredCourt;
	private int lastFought;

	public PlayeerCareer(int matchesPlayed, int matchesWon, int currentRanking, int bestRanking, String preferredCourt,
			int lastFought) {
		super();
		this.matchesPlayed = matchesPlayed;
		this.matchesWon = matchesWon;
		this.currentRanking = currentRanking;
		this.bestRanking = bestRanking;
		this.preferredCourt = preferredCourt;
		this.lastFought = lastFought;
	}

	public int getMatchesPlayed() {
		return matchesPlayed;
	}

	public void setMatchesPlayed(int matchesPlayed) {
		this.matchesPlayed = matchesPlayed;
	}

	public int getMatchesWon() {
		return matchesWon;
	}

	public void setMatchesWon(int matchesWon) {
		this.matchesWon = matchesWon;
	}

	public int getCurrentRanking() {
		return currentRanking;
	}

	public void setCurrentRanking(int currentRanking) {
		this.currentRanking = currentRanking;
	}

	public int getBestRanking() {
		return bestRanking;
	}

	public void setBestRanking(int bestRanking) {
		this.bestRanking = bestRanking;
	}

	public String getPreferredCourt() {
		return preferredCourt;
	}

	public void setPreferredCourt(String preferredCourt) {
		this.preferredCourt = preferredCourt;
	}

	public int getLastFought() {
		return lastFought;
	}

	public void setLastFought(int lastFought) {
		this.lastFought = lastFought;
	}

	@Override
	public String toString() {
		return "PlayeerCareer [matchesPlayed=" + matchesPlayed + ", matchesWon=" + matchesWon + ", currentRanking="
				+ currentRanking + ", bestRanking=" + bestRanking + ", preferredCourt=" + preferredCourt
				+ ", lastFought=" + lastFought + "]";
	}

}
