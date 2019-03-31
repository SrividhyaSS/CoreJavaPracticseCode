package assessment2;

import java.util.HashMap;
import java.util.Map;



public class TennisPlayer {

	public int playerCode;
	private String playerName;
	private PlayeerCareer careerDetail;

	public TennisPlayer(int playerCode, String playerName, PlayeerCareer careerDetail) {
		super();
		this.playerCode = playerCode;
		this.playerName = playerName;
		this.careerDetail = careerDetail;
	}

	public int getPlayerCode() {
		return playerCode;
	}

	public void setPlayerCode(int playerCode) {
		this.playerCode = playerCode;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public PlayeerCareer getCareerDetail() {
		return careerDetail;
	}

	public void setCareerDetail(PlayeerCareer careerDetail) {
		this.careerDetail = careerDetail;
	}

	@Override
	public String toString() {
		return "TennisPlayer [playerCode=" + playerCode + ", playerName=" + playerName + ", careerDetail="
				+ careerDetail + "]";
	}

	public int playMatch(int code1, int code2, String result, 
			                 Map<TennisPlayer,PlayeerCareer> players) throws PlayerClassException 
	{
		
		
		if(result.equals("Win"))
		{
			if(players.containsKey(code1))
			{
				System.out.println("InsideWinLoop");
				int matchesPlayed = careerDetail.getMatchesPlayed()+1;
				int matchesWon = 1;
				int currentRanking = careerDetail.getCurrentRanking()-1;
				int bestRanking = currentRanking;
				String preferredCourt = careerDetail.getPreferredCourt();
				int lastFought = code2;
			}
		}
		else if(result.equals("Loss"))
		{
			if(players.containsKey(code1))
			{
				System.out.println("InsideLossLoop");
				int matchesPlayed = careerDetail.getMatchesPlayed()+1;
				int matchesWon = -1;
				int currentRanking = careerDetail.getCurrentRanking()+1;
				int bestRanking = currentRanking;
				String preferredCourt = careerDetail.getPreferredCourt();
				int lastFought = code2;
			}
		}
		else
			throw new PlayerClassException("Player Should Either Win or Loss");
		
		return code2;
				
	}

	
	
		/* if(result.equals("Win")) 
		 { 
			 
			 int matchesPlayed = career.getMatchesPlayed()+1; 
			 int matchesWon = career.getMatchesWon()+1;
			 int currentRanking = career.getCurrentRanking(); 
			 if(currentRanking!=1 && matchesWon) 
			 { 
				 if(matchesWon)
				 {
	  
	  } 
				 } 
			 return addScore++; 
			 } else if(result.equals("Loss"))
			 {
				 return addScore--;
	  } 
			 else { 
				 return addScore; 
				 }
		 }*/
	 

}
