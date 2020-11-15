public class BoardInstance {
    private static BoardMode boardInstance;

    public static void setBoard(BoardMode boardMode){
        if(boardInstance == null){
            boardInstance = boardMode;
        }
    }

    public static BoardMode getBoard(){
        if (boardInstance == null){
            boardInstance = new StandardBoard();
        }
        return boardInstance;
    }

    public static Piece getPieceAtPosition(Position posOfPiece){
        for(Piece p:boardInstance.getBoardState()){
            if(p.getPosition().equals(posOfPiece)){
                return p;
            }
        }
        return null;
    }

    public static boolean isValidPosition(Position posToCheck, Affiliation affiliation) {
        if(!isValidX(posToCheck)){
            return false;
        }
        if(!isValidY(posToCheck)){
            return false;
        }
        if(!isValidSquare(posToCheck, affiliation)){
            return false;
        }
        return true;
    }

    private static boolean isValidX(Position posToCheck){
        return posToCheck.getX() >= 0 && posToCheck.getX() <= boardInstance.getXSize();
    }

    private static boolean isValidY(Position posToCheck){
        return posToCheck.getY() >= 0 && posToCheck.getY() <= boardInstance.getYSize();
    }

    private static boolean isValidSquare(Position posToCheck, Affiliation affiliation) {
        return getPieceAtPosition(posToCheck).getAffiliation() != affiliation;
    }
}
