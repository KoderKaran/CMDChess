public interface PieceBehaviorInterface {
	ValidMoveResultWrapper getMovementStrategy(Position currPos); //returns x,y's that it can move to
	PieceUnicodeEnum getPieceUnicode();
	boolean allowChanging();
	float getScore();
}
