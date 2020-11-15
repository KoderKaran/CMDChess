import java.util.ArrayList;

public class ChessController {
	private ArrayList<Player> players;
	private ArrayList<Piece> pieces;
	private boolean isOver;
	private Player currPlayer;

	public ChessController(){
		players = new ArrayList<>();
	}

	public void initializePieces(){

	}

	public boolean isOver() {
		return isOver;
	}

	public Player getCurrPlayer() {
		return currPlayer;
	}
}
