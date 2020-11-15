public abstract class Piece {
	private Position position;
	private Affiliation affiliation;
	private PieceBehaviorInterface pieceBehavior;

	public Piece(Position startingPosition, Affiliation affiliation, PieceBehaviorInterface pieceBehavior)
	{
		this.position = startingPosition;
		this.affiliation = affiliation;
		this.pieceBehavior = pieceBehavior;
	}

	public float getScore(){
		return this.pieceBehavior.getScore();
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public Affiliation getAffiliation() {
		return affiliation;
	}

	public void setAffiliation(Affiliation affiliation) {
		this.affiliation = affiliation;
	}

	public PieceBehaviorInterface getPieceBehavior() {
		return pieceBehavior;
	}

	public void setPieceBehavior(PieceBehaviorInterface pieceBehavior) {
		if(this.pieceBehavior.allowChanging()){
			this.pieceBehavior = pieceBehavior;
		}
	}
}
