package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

public class Ghost extends GamePiece{
	
	public Ghost(char symbol, String label, int location) {
		super('G', "Ghost", location);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "G - Ghost flys around and hits people.";
	}

	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
		// TODO Auto-generated method stub
		if(this.getLocation() == playerLocation) {
			gameBoard[playerLocation] = null;
			return InteractionResult.GET_POINT;
		} else {
			return InteractionResult.NONE;
		}
	}

}
