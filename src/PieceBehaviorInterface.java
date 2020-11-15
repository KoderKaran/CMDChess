public interface PieceBehaviorInterface {
	ValidMoveResultWrapper getMovementStrategy(); //returns x,y's that it can move to
	PieceUnicodeEnum getPieceUnicode();
	boolean allowChanging();
	float getScore();
}
