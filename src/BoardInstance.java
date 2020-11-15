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



}
