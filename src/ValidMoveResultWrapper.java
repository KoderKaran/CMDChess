import java.util.ArrayList;

public class ValidMoveResultWrapper {
	private ArrayList<Position> validMoves = new ArrayList<>();

	public void addMove(int x, int y){
		validMoves.add(new Position(x,y));
	}

	public void addValidMoveWrapper(ValidMoveResultWrapper move){
		validMoves.addAll(move.getValidMoves());
	}

	public ArrayList<Position> getValidMoves(){
		return validMoves;
	}
}
