package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

public class Snake extends GamePiece{

	public Snake(char symbol, String label, int location) {
		super('H', "Snake", location);
	// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "H - Snake gives people a lift and adavnces their spot. ";
	}

	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
		// TODO Auto-generated method stub
		if(this.getLocation() == playerLocation) {
			
			gameBoard[playerLocation] = null;
			return InteractionResult.ADVANCE;
		} else {
			return InteractionResult.NONE;
		}
	}
}
