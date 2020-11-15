import java.util.ArrayList;

public class StandardBoard implements BoardMode{

    private final int X_SIZE = 8;
    private final int Y_SIZE = 8;
    private ArrayList<Piece> boardState;

    @Override
    public int getXSize() {
        return X_SIZE;
    }

    @Override
    public int getYSize() {
        return Y_SIZE;
    }

    @Override
    public void setInitialBoardState() {
        boardState = new ArrayList<>();
    }

    @Override
    public ArrayList<Piece> getBoardState() {
        return boardState;
    }

    @Override
    public void movePiece(Piece piece, Position newPos) {
        for(Piece p:boardState){

        }
    }
}
