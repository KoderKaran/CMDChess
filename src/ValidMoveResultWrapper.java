import java.util.ArrayList;

public class ValidMoveResultWrapper {
	private ArrayList<Position> validMoves = new ArrayList<>();

	public void addMove(int x, int y){
		this.validMoves.add(new Position(x,y));
	}

	public void addMoves(ArrayList<Position> validMoves){
		this.validMoves.addAll(validMoves);
	}

	public void addValidMoveWrapper(ValidMoveResultWrapper move){
		this.validMoves.addAll(move.getValidMoves());
	}

	public ArrayList<Position> getValidMoves(){
		return this.validMoves;
	}
}
