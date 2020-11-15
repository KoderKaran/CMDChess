import java.util.ArrayList;

public interface BoardMode {
    int getXSize();
    int getYSize();
    void setInitialBoardState();
    ArrayList<Piece> getBoardState();
    void movePiece(Piece piece, Position newPos);
}
