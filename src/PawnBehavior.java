public class PawnBehavior implements PieceBehaviorInterface {

    private PieceUnicodeEnum unicode;
    private boolean didMove = false;

    public PawnBehavior(Affiliation affiliation){
        this.unicode = affiliation == Affiliation.BLACK ? PieceUnicodeEnum.B_PAWN : PieceUnicodeEnum.W_PAWN;
    }

    @Override
    public ValidMoveResultWrapper getMovementStrategy(Position currPos) {
        ValidMoveResultWrapper tempValidMoves = new ValidMoveResultWrapper();
        int forwardAmount = 1;
        if(!didMove){
            forwardAmount = 2;
        }

        return null;
    }

    @Override
    public PieceUnicodeEnum getPieceUnicode() {
        return unicode;
    }

    @Override
    public boolean allowChanging() {
        return true;
    }

    @Override
    public float getScore() {
        return 0;
    }
}
