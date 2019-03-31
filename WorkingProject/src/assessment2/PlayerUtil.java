package assessment2;

import java.util.Map;

public class PlayerUtil {

	PlayeerCareer careerDetail = null;

	public int playMatch(int code1, int code2, String result, Map<Integer, TennisPlayer> players)
			throws PlayerClassException {

		if (result.equals("Win")) {
			if (players.containsKey(code1)) {
				System.out.println("InsideWinLoop:Code1");
				int matchesPlayed = careerDetail.getMatchesPlayed() + 1;
				int matchesWon = 1;
				int currentRanking = careerDetail.getCurrentRanking() - 1;
				int bestRanking = currentRanking;
				String preferredCourt = careerDetail.getPreferredCourt();
				int lastFought = code2;

			} else if (players.containsKey(code2)) {
				System.out.println("InsideWinLoop:Code2");
				int matchesPlayed = careerDetail.getMatchesPlayed() + 1;
				int matchesWon = -1;
				int currentRanking = careerDetail.getCurrentRanking() + 1;
				int bestRanking = currentRanking;
				String preferredCourt = careerDetail.getPreferredCourt();
				int lastFought = code1;
			}
		} else if (result.equals("Loss")) {
			if (players.containsKey(code1)) {
				System.out.println("InsideLossLoop:Code1");
				int matchesPlayed = careerDetail.getMatchesPlayed() + 1;
				int matchesWon = -1;
				int currentRanking = careerDetail.getCurrentRanking() + 1;
				int bestRanking = currentRanking;
				String preferredCourt = careerDetail.getPreferredCourt();
				int lastFought = code2;
			} else if (players.containsKey(code2)) {
				System.out.println("InsideWinLoop:Code2");
				int matchesPlayed = careerDetail.getMatchesPlayed() + 1;
				int matchesWon = 1;
				int currentRanking = careerDetail.getCurrentRanking() - 1;
				int bestRanking = currentRanking;
				String preferredCourt = careerDetail.getPreferredCourt();
				int lastFought = code1;
			}
		} else
			throw new PlayerClassException("Player Should Either Win or Loss");

		return code2;

	}

}
