import java.util.ArrayList;

public class PawnBehavior implements PieceBehaviorInterface {

    private PieceUnicodeEnum unicode;
    private boolean didMove = false;
    private Affiliation affiliation;

    public PawnBehavior(Affiliation affiliation){
        this.affiliation = affiliation;
        this.unicode = affiliation == Affiliation.BLACK ? PieceUnicodeEnum.B_PAWN : PieceUnicodeEnum.W_PAWN;
    }

    @Override
    public ValidMoveResultWrapper getMovementStrategy(Position currPos) {
        ValidMoveResultWrapper tempValidMoves = new ValidMoveResultWrapper();
        int forwardAmount = getForwardAmount();
        int attackModifier = forwardAmount > 0 ? 1:-1;
        ArrayList<Position> validForwardMoves = getForwardMoves(currPos,forwardAmount);



        return null;
    }

    private int getForwardAmount(){
        int forwardAmount = 1;
        if(!didMove){
            forwardAmount = 2;
        }
        if(unicode == PieceUnicodeEnum.W_PAWN){
            forwardAmount *= -1;
        }
        return forwardAmount;
    }

    private ArrayList<Position> getForwardMoves(ArrayList<Position> moves,Position currPos, int forwardAmount){
        Position forwardMove = new Position(currPos.getX(), currPos.getY() + forwardAmount);
        BoardInstance.isValidPosition(forwardMove,affiliation);
        return moves;
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
