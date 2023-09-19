package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

public class CompOrgMonster extends GamePiece{

	public CompOrgMonster(char symbol, String label, int location) {
		super('C', "Comp Org Monster", location);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "C - You have been brutally murdered by the Comp Org Monster, you also made a "
				+ "big ole fat ZERO on your latest quiz.";
	}
	
	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
		// TODO Auto-generated method stub
		if(this.getLocation() == playerLocation) {
			gameBoard[playerLocation] = null;
			return InteractionResult.KILL;
		} else {
			return InteractionResult.NONE;
		}
	}
}
