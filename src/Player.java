import java.util.ArrayList;

public class Player {
	private float currPlayerScore;
	private float relativePlayerScore;
	private ArrayList<Piece> pieces;
	private Affiliation affiliation;

	public Player(Affiliation affiliation, ArrayList<Piece> pieces){
		this.affiliation = affiliation;
		this.pieces = pieces;
		this.relativePlayerScore = 0;
		updateCurrScore();
	}

	public void updateRelativeScore(Player otherPlayer){
		boolean isWinning = this.currPlayerScore > otherPlayer.relativePlayerScore;
		this.relativePlayerScore = Math.abs(this.currPlayerScore - otherPlayer.relativePlayerScore);
		if(!isWinning){
			this.relativePlayerScore *= -1;
		}
	}

	public float getRelativePlayerScore(){
		return this.relativePlayerScore;
	}

	public void updateCurrScore(){
		for(Piece p:pieces) {
			this.currPlayerScore += p.getScore();
		}
	}

	public float getCurrPlayerScore() {
		return currPlayerScore;
	}

	public Affiliation getAffiliation() {
		return affiliation;
	}
}
