public class Position {
	private final int[] position;

	public Position(int x, int y){
		position = new int[]{x,y};
	}

	public int[] getPosition(){
		return this.position;
	}

	public int getX(){
		return position[0];
	}

	public int getY(){
		return position[1];
	}

}
