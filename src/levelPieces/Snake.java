package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

public class Snake extends GamePiece{

	public Snake(char symbol, String label, int location) {
		super('S', "Snake", location);
	// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "S - Sanke gives the player a point";
	}

	@Override
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
